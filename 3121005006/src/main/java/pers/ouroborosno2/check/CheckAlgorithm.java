package pers.ouroborosno2.check;

import java.util.List;

/**
 * @author OuroborosNo2
 * 查重算法接口
 */
public interface CheckAlgorithm {
    /**
     * 计算相似度
     * @author OuroborosNo2
     * @return 相似度
     */
    double check();

    /**
     * 计算相似度
     * @author OuroborosNo2
     * @param v1 向量1
     * @param v2 向量2
     * @return 相似度
     */
    double check(List<Double> v1, List<Double> v2);
}
