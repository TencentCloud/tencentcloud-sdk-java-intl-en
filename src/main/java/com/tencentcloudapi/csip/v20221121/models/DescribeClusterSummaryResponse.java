/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSummaryResponse extends AbstractModel {

    /**
    * <p>Total number of clusters</p>
    */
    @SerializedName("TotalClusterCount")
    @Expose
    private Long TotalClusterCount;

    /**
    * <p>Total number of clusters with alarms</p>
    */
    @SerializedName("AlarmClusterCount")
    @Expose
    private Long AlarmClusterCount;

    /**
    * <p>Total number of clusters at risk</p>
    */
    @SerializedName("RiskClusterCount")
    @Expose
    private Long RiskClusterCount;

    /**
    * <p>Total nodes</p>
    */
    @SerializedName("TotalNodeCount")
    @Expose
    private Long TotalNodeCount;

    /**
    * <p>Total cores.</p>
    */
    @SerializedName("TotalCoreCount")
    @Expose
    private Long TotalCoreCount;

    /**
    * <p>Total number of alarm events</p>
    */
    @SerializedName("AlarmEventCount")
    @Expose
    private Long AlarmEventCount;

    /**
    * <p>Number of critical alarm events</p>
    */
    @SerializedName("CriticalAlarmEventCount")
    @Expose
    private Long CriticalAlarmEventCount;

    /**
    * <p>Number of high-risk alarm events</p>
    */
    @SerializedName("HighAlarmEventCount")
    @Expose
    private Long HighAlarmEventCount;

    /**
    * <p>Number of medium-risk alarm events</p>
    */
    @SerializedName("MiddleAlarmEventCount")
    @Expose
    private Long MiddleAlarmEventCount;

    /**
    * <p>Number of low-risk alarm events</p>
    */
    @SerializedName("LowAlarmEventCount")
    @Expose
    private Long LowAlarmEventCount;

    /**
    * <p>Total number of risk events</p>
    */
    @SerializedName("RiskEventCount")
    @Expose
    private Long RiskEventCount;

    /**
    * <p>Number of critical risk events</p>
    */
    @SerializedName("CriticalRiskEventCount")
    @Expose
    private Long CriticalRiskEventCount;

    /**
    * <p>Number of high-severity risk events</p>
    */
    @SerializedName("HighRiskEventCount")
    @Expose
    private Long HighRiskEventCount;

    /**
    * <p>Number of medium-risk risk events</p>
    */
    @SerializedName("MiddleRiskEventCount")
    @Expose
    private Long MiddleRiskEventCount;

    /**
    * <p>Number of low-risk events</p>
    */
    @SerializedName("LowRiskEventCount")
    @Expose
    private Long LowRiskEventCount;

    /**
    * <p>Used core amount limit</p>
    */
    @SerializedName("UsedCoreQuota")
    @Expose
    private Long UsedCoreQuota;

    /**
    * <p>Number of purchased cores limit</p>
    */
    @SerializedName("PurchasedCoreQuota")
    @Expose
    private Long PurchasedCoreQuota;

    /**
    * <p>Elastic Billing Cores</p>
    */
    @SerializedName("ElasticCoreQuota")
    @Expose
    private Long ElasticCoreQuota;

    /**
    * <p>Unprotected cores in the cluster</p>
    */
    @SerializedName("UnprotectedCoreCount")
    @Expose
    private Long UnprotectedCoreCount;

    /**
    * <p>Number of protected cores in the cluster</p>
    */
    @SerializedName("ProtectedCoreCount")
    @Expose
    private Long ProtectedCoreCount;

    /**
    * <p>Number of unprotected clusters</p>
    */
    @SerializedName("UnprotectedClusterCount")
    @Expose
    private Long UnprotectedClusterCount;

    /**
    * <p>Number of protected clusters</p>
    */
    @SerializedName("ProtectedClusterCount")
    @Expose
    private Long ProtectedClusterCount;

    /**
    * <p>Number of Tencent Cloud TKE clusters</p>
    */
    @SerializedName("TkeClusterCount")
    @Expose
    private Long TkeClusterCount;

    /**
    * <p>Number of self-built clusters</p>
    */
    @SerializedName("SelfBuiltClusterCount")
    @Expose
    private Long SelfBuiltClusterCount;

    /**
    * <p>Number of clusters with critical alerts</p>
    */
    @SerializedName("CriticalAlarmClusterCount")
    @Expose
    private Long CriticalAlarmClusterCount;

    /**
    * <p>Number of high-risk alert clusters</p>
    */
    @SerializedName("HighAlarmClusterCount")
    @Expose
    private Long HighAlarmClusterCount;

    /**
    * <p>Number of clusters at critical risk</p>
    */
    @SerializedName("CriticalRiskClusterCount")
    @Expose
    private Long CriticalRiskClusterCount;

    /**
    * <p>Number of high-risk clusters</p>
    */
    @SerializedName("HighRiskClusterCount")
    @Expose
    private Long HighRiskClusterCount;

    /**
    * <p>Number of nodes not bound to the Ultimate Edition</p>
    */
    @SerializedName("UnboundUltimateNodeCount")
    @Expose
    private Long UnboundUltimateNodeCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Total number of clusters</p> 
     * @return TotalClusterCount <p>Total number of clusters</p>
     */
    public Long getTotalClusterCount() {
        return this.TotalClusterCount;
    }

    /**
     * Set <p>Total number of clusters</p>
     * @param TotalClusterCount <p>Total number of clusters</p>
     */
    public void setTotalClusterCount(Long TotalClusterCount) {
        this.TotalClusterCount = TotalClusterCount;
    }

    /**
     * Get <p>Total number of clusters with alarms</p> 
     * @return AlarmClusterCount <p>Total number of clusters with alarms</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmClusterCount() {
        return this.AlarmClusterCount;
    }

    /**
     * Set <p>Total number of clusters with alarms</p>
     * @param AlarmClusterCount <p>Total number of clusters with alarms</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmClusterCount(Long AlarmClusterCount) {
        this.AlarmClusterCount = AlarmClusterCount;
    }

    /**
     * Get <p>Total number of clusters at risk</p> 
     * @return RiskClusterCount <p>Total number of clusters at risk</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskClusterCount() {
        return this.RiskClusterCount;
    }

    /**
     * Set <p>Total number of clusters at risk</p>
     * @param RiskClusterCount <p>Total number of clusters at risk</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskClusterCount(Long RiskClusterCount) {
        this.RiskClusterCount = RiskClusterCount;
    }

    /**
     * Get <p>Total nodes</p> 
     * @return TotalNodeCount <p>Total nodes</p>
     */
    public Long getTotalNodeCount() {
        return this.TotalNodeCount;
    }

    /**
     * Set <p>Total nodes</p>
     * @param TotalNodeCount <p>Total nodes</p>
     */
    public void setTotalNodeCount(Long TotalNodeCount) {
        this.TotalNodeCount = TotalNodeCount;
    }

    /**
     * Get <p>Total cores.</p> 
     * @return TotalCoreCount <p>Total cores.</p>
     */
    public Long getTotalCoreCount() {
        return this.TotalCoreCount;
    }

    /**
     * Set <p>Total cores.</p>
     * @param TotalCoreCount <p>Total cores.</p>
     */
    public void setTotalCoreCount(Long TotalCoreCount) {
        this.TotalCoreCount = TotalCoreCount;
    }

    /**
     * Get <p>Total number of alarm events</p> 
     * @return AlarmEventCount <p>Total number of alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCount() {
        return this.AlarmEventCount;
    }

    /**
     * Set <p>Total number of alarm events</p>
     * @param AlarmEventCount <p>Total number of alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCount(Long AlarmEventCount) {
        this.AlarmEventCount = AlarmEventCount;
    }

    /**
     * Get <p>Number of critical alarm events</p> 
     * @return CriticalAlarmEventCount <p>Number of critical alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalAlarmEventCount() {
        return this.CriticalAlarmEventCount;
    }

    /**
     * Set <p>Number of critical alarm events</p>
     * @param CriticalAlarmEventCount <p>Number of critical alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalAlarmEventCount(Long CriticalAlarmEventCount) {
        this.CriticalAlarmEventCount = CriticalAlarmEventCount;
    }

    /**
     * Get <p>Number of high-risk alarm events</p> 
     * @return HighAlarmEventCount <p>Number of high-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighAlarmEventCount() {
        return this.HighAlarmEventCount;
    }

    /**
     * Set <p>Number of high-risk alarm events</p>
     * @param HighAlarmEventCount <p>Number of high-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setHighAlarmEventCount(Long HighAlarmEventCount) {
        this.HighAlarmEventCount = HighAlarmEventCount;
    }

    /**
     * Get <p>Number of medium-risk alarm events</p> 
     * @return MiddleAlarmEventCount <p>Number of medium-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getMiddleAlarmEventCount() {
        return this.MiddleAlarmEventCount;
    }

    /**
     * Set <p>Number of medium-risk alarm events</p>
     * @param MiddleAlarmEventCount <p>Number of medium-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setMiddleAlarmEventCount(Long MiddleAlarmEventCount) {
        this.MiddleAlarmEventCount = MiddleAlarmEventCount;
    }

    /**
     * Get <p>Number of low-risk alarm events</p> 
     * @return LowAlarmEventCount <p>Number of low-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public Long getLowAlarmEventCount() {
        return this.LowAlarmEventCount;
    }

    /**
     * Set <p>Number of low-risk alarm events</p>
     * @param LowAlarmEventCount <p>Number of low-risk alarm events</p>
     * @deprecated
     */
    @Deprecated
    public void setLowAlarmEventCount(Long LowAlarmEventCount) {
        this.LowAlarmEventCount = LowAlarmEventCount;
    }

    /**
     * Get <p>Total number of risk events</p> 
     * @return RiskEventCount <p>Total number of risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCount() {
        return this.RiskEventCount;
    }

    /**
     * Set <p>Total number of risk events</p>
     * @param RiskEventCount <p>Total number of risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCount(Long RiskEventCount) {
        this.RiskEventCount = RiskEventCount;
    }

    /**
     * Get <p>Number of critical risk events</p> 
     * @return CriticalRiskEventCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalRiskEventCount() {
        return this.CriticalRiskEventCount;
    }

    /**
     * Set <p>Number of critical risk events</p>
     * @param CriticalRiskEventCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalRiskEventCount(Long CriticalRiskEventCount) {
        this.CriticalRiskEventCount = CriticalRiskEventCount;
    }

    /**
     * Get <p>Number of high-severity risk events</p> 
     * @return HighRiskEventCount <p>Number of high-severity risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighRiskEventCount() {
        return this.HighRiskEventCount;
    }

    /**
     * Set <p>Number of high-severity risk events</p>
     * @param HighRiskEventCount <p>Number of high-severity risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setHighRiskEventCount(Long HighRiskEventCount) {
        this.HighRiskEventCount = HighRiskEventCount;
    }

    /**
     * Get <p>Number of medium-risk risk events</p> 
     * @return MiddleRiskEventCount <p>Number of medium-risk risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getMiddleRiskEventCount() {
        return this.MiddleRiskEventCount;
    }

    /**
     * Set <p>Number of medium-risk risk events</p>
     * @param MiddleRiskEventCount <p>Number of medium-risk risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setMiddleRiskEventCount(Long MiddleRiskEventCount) {
        this.MiddleRiskEventCount = MiddleRiskEventCount;
    }

    /**
     * Get <p>Number of low-risk events</p> 
     * @return LowRiskEventCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getLowRiskEventCount() {
        return this.LowRiskEventCount;
    }

    /**
     * Set <p>Number of low-risk events</p>
     * @param LowRiskEventCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setLowRiskEventCount(Long LowRiskEventCount) {
        this.LowRiskEventCount = LowRiskEventCount;
    }

    /**
     * Get <p>Used core amount limit</p> 
     * @return UsedCoreQuota <p>Used core amount limit</p>
     */
    public Long getUsedCoreQuota() {
        return this.UsedCoreQuota;
    }

    /**
     * Set <p>Used core amount limit</p>
     * @param UsedCoreQuota <p>Used core amount limit</p>
     */
    public void setUsedCoreQuota(Long UsedCoreQuota) {
        this.UsedCoreQuota = UsedCoreQuota;
    }

    /**
     * Get <p>Number of purchased cores limit</p> 
     * @return PurchasedCoreQuota <p>Number of purchased cores limit</p>
     */
    public Long getPurchasedCoreQuota() {
        return this.PurchasedCoreQuota;
    }

    /**
     * Set <p>Number of purchased cores limit</p>
     * @param PurchasedCoreQuota <p>Number of purchased cores limit</p>
     */
    public void setPurchasedCoreQuota(Long PurchasedCoreQuota) {
        this.PurchasedCoreQuota = PurchasedCoreQuota;
    }

    /**
     * Get <p>Elastic Billing Cores</p> 
     * @return ElasticCoreQuota <p>Elastic Billing Cores</p>
     */
    public Long getElasticCoreQuota() {
        return this.ElasticCoreQuota;
    }

    /**
     * Set <p>Elastic Billing Cores</p>
     * @param ElasticCoreQuota <p>Elastic Billing Cores</p>
     */
    public void setElasticCoreQuota(Long ElasticCoreQuota) {
        this.ElasticCoreQuota = ElasticCoreQuota;
    }

    /**
     * Get <p>Unprotected cores in the cluster</p> 
     * @return UnprotectedCoreCount <p>Unprotected cores in the cluster</p>
     */
    public Long getUnprotectedCoreCount() {
        return this.UnprotectedCoreCount;
    }

    /**
     * Set <p>Unprotected cores in the cluster</p>
     * @param UnprotectedCoreCount <p>Unprotected cores in the cluster</p>
     */
    public void setUnprotectedCoreCount(Long UnprotectedCoreCount) {
        this.UnprotectedCoreCount = UnprotectedCoreCount;
    }

    /**
     * Get <p>Number of protected cores in the cluster</p> 
     * @return ProtectedCoreCount <p>Number of protected cores in the cluster</p>
     */
    public Long getProtectedCoreCount() {
        return this.ProtectedCoreCount;
    }

    /**
     * Set <p>Number of protected cores in the cluster</p>
     * @param ProtectedCoreCount <p>Number of protected cores in the cluster</p>
     */
    public void setProtectedCoreCount(Long ProtectedCoreCount) {
        this.ProtectedCoreCount = ProtectedCoreCount;
    }

    /**
     * Get <p>Number of unprotected clusters</p> 
     * @return UnprotectedClusterCount <p>Number of unprotected clusters</p>
     */
    public Long getUnprotectedClusterCount() {
        return this.UnprotectedClusterCount;
    }

    /**
     * Set <p>Number of unprotected clusters</p>
     * @param UnprotectedClusterCount <p>Number of unprotected clusters</p>
     */
    public void setUnprotectedClusterCount(Long UnprotectedClusterCount) {
        this.UnprotectedClusterCount = UnprotectedClusterCount;
    }

    /**
     * Get <p>Number of protected clusters</p> 
     * @return ProtectedClusterCount <p>Number of protected clusters</p>
     */
    public Long getProtectedClusterCount() {
        return this.ProtectedClusterCount;
    }

    /**
     * Set <p>Number of protected clusters</p>
     * @param ProtectedClusterCount <p>Number of protected clusters</p>
     */
    public void setProtectedClusterCount(Long ProtectedClusterCount) {
        this.ProtectedClusterCount = ProtectedClusterCount;
    }

    /**
     * Get <p>Number of Tencent Cloud TKE clusters</p> 
     * @return TkeClusterCount <p>Number of Tencent Cloud TKE clusters</p>
     */
    public Long getTkeClusterCount() {
        return this.TkeClusterCount;
    }

    /**
     * Set <p>Number of Tencent Cloud TKE clusters</p>
     * @param TkeClusterCount <p>Number of Tencent Cloud TKE clusters</p>
     */
    public void setTkeClusterCount(Long TkeClusterCount) {
        this.TkeClusterCount = TkeClusterCount;
    }

    /**
     * Get <p>Number of self-built clusters</p> 
     * @return SelfBuiltClusterCount <p>Number of self-built clusters</p>
     */
    public Long getSelfBuiltClusterCount() {
        return this.SelfBuiltClusterCount;
    }

    /**
     * Set <p>Number of self-built clusters</p>
     * @param SelfBuiltClusterCount <p>Number of self-built clusters</p>
     */
    public void setSelfBuiltClusterCount(Long SelfBuiltClusterCount) {
        this.SelfBuiltClusterCount = SelfBuiltClusterCount;
    }

    /**
     * Get <p>Number of clusters with critical alerts</p> 
     * @return CriticalAlarmClusterCount <p>Number of clusters with critical alerts</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalAlarmClusterCount() {
        return this.CriticalAlarmClusterCount;
    }

    /**
     * Set <p>Number of clusters with critical alerts</p>
     * @param CriticalAlarmClusterCount <p>Number of clusters with critical alerts</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalAlarmClusterCount(Long CriticalAlarmClusterCount) {
        this.CriticalAlarmClusterCount = CriticalAlarmClusterCount;
    }

    /**
     * Get <p>Number of high-risk alert clusters</p> 
     * @return HighAlarmClusterCount <p>Number of high-risk alert clusters</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighAlarmClusterCount() {
        return this.HighAlarmClusterCount;
    }

    /**
     * Set <p>Number of high-risk alert clusters</p>
     * @param HighAlarmClusterCount <p>Number of high-risk alert clusters</p>
     * @deprecated
     */
    @Deprecated
    public void setHighAlarmClusterCount(Long HighAlarmClusterCount) {
        this.HighAlarmClusterCount = HighAlarmClusterCount;
    }

    /**
     * Get <p>Number of clusters at critical risk</p> 
     * @return CriticalRiskClusterCount <p>Number of clusters at critical risk</p>
     * @deprecated
     */
    @Deprecated
    public Long getCriticalRiskClusterCount() {
        return this.CriticalRiskClusterCount;
    }

    /**
     * Set <p>Number of clusters at critical risk</p>
     * @param CriticalRiskClusterCount <p>Number of clusters at critical risk</p>
     * @deprecated
     */
    @Deprecated
    public void setCriticalRiskClusterCount(Long CriticalRiskClusterCount) {
        this.CriticalRiskClusterCount = CriticalRiskClusterCount;
    }

    /**
     * Get <p>Number of high-risk clusters</p> 
     * @return HighRiskClusterCount <p>Number of high-risk clusters</p>
     * @deprecated
     */
    @Deprecated
    public Long getHighRiskClusterCount() {
        return this.HighRiskClusterCount;
    }

    /**
     * Set <p>Number of high-risk clusters</p>
     * @param HighRiskClusterCount <p>Number of high-risk clusters</p>
     * @deprecated
     */
    @Deprecated
    public void setHighRiskClusterCount(Long HighRiskClusterCount) {
        this.HighRiskClusterCount = HighRiskClusterCount;
    }

    /**
     * Get <p>Number of nodes not bound to the Ultimate Edition</p> 
     * @return UnboundUltimateNodeCount <p>Number of nodes not bound to the Ultimate Edition</p>
     */
    public Long getUnboundUltimateNodeCount() {
        return this.UnboundUltimateNodeCount;
    }

    /**
     * Set <p>Number of nodes not bound to the Ultimate Edition</p>
     * @param UnboundUltimateNodeCount <p>Number of nodes not bound to the Ultimate Edition</p>
     */
    public void setUnboundUltimateNodeCount(Long UnboundUltimateNodeCount) {
        this.UnboundUltimateNodeCount = UnboundUltimateNodeCount;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSummaryResponse(DescribeClusterSummaryResponse source) {
        if (source.TotalClusterCount != null) {
            this.TotalClusterCount = new Long(source.TotalClusterCount);
        }
        if (source.AlarmClusterCount != null) {
            this.AlarmClusterCount = new Long(source.AlarmClusterCount);
        }
        if (source.RiskClusterCount != null) {
            this.RiskClusterCount = new Long(source.RiskClusterCount);
        }
        if (source.TotalNodeCount != null) {
            this.TotalNodeCount = new Long(source.TotalNodeCount);
        }
        if (source.TotalCoreCount != null) {
            this.TotalCoreCount = new Long(source.TotalCoreCount);
        }
        if (source.AlarmEventCount != null) {
            this.AlarmEventCount = new Long(source.AlarmEventCount);
        }
        if (source.CriticalAlarmEventCount != null) {
            this.CriticalAlarmEventCount = new Long(source.CriticalAlarmEventCount);
        }
        if (source.HighAlarmEventCount != null) {
            this.HighAlarmEventCount = new Long(source.HighAlarmEventCount);
        }
        if (source.MiddleAlarmEventCount != null) {
            this.MiddleAlarmEventCount = new Long(source.MiddleAlarmEventCount);
        }
        if (source.LowAlarmEventCount != null) {
            this.LowAlarmEventCount = new Long(source.LowAlarmEventCount);
        }
        if (source.RiskEventCount != null) {
            this.RiskEventCount = new Long(source.RiskEventCount);
        }
        if (source.CriticalRiskEventCount != null) {
            this.CriticalRiskEventCount = new Long(source.CriticalRiskEventCount);
        }
        if (source.HighRiskEventCount != null) {
            this.HighRiskEventCount = new Long(source.HighRiskEventCount);
        }
        if (source.MiddleRiskEventCount != null) {
            this.MiddleRiskEventCount = new Long(source.MiddleRiskEventCount);
        }
        if (source.LowRiskEventCount != null) {
            this.LowRiskEventCount = new Long(source.LowRiskEventCount);
        }
        if (source.UsedCoreQuota != null) {
            this.UsedCoreQuota = new Long(source.UsedCoreQuota);
        }
        if (source.PurchasedCoreQuota != null) {
            this.PurchasedCoreQuota = new Long(source.PurchasedCoreQuota);
        }
        if (source.ElasticCoreQuota != null) {
            this.ElasticCoreQuota = new Long(source.ElasticCoreQuota);
        }
        if (source.UnprotectedCoreCount != null) {
            this.UnprotectedCoreCount = new Long(source.UnprotectedCoreCount);
        }
        if (source.ProtectedCoreCount != null) {
            this.ProtectedCoreCount = new Long(source.ProtectedCoreCount);
        }
        if (source.UnprotectedClusterCount != null) {
            this.UnprotectedClusterCount = new Long(source.UnprotectedClusterCount);
        }
        if (source.ProtectedClusterCount != null) {
            this.ProtectedClusterCount = new Long(source.ProtectedClusterCount);
        }
        if (source.TkeClusterCount != null) {
            this.TkeClusterCount = new Long(source.TkeClusterCount);
        }
        if (source.SelfBuiltClusterCount != null) {
            this.SelfBuiltClusterCount = new Long(source.SelfBuiltClusterCount);
        }
        if (source.CriticalAlarmClusterCount != null) {
            this.CriticalAlarmClusterCount = new Long(source.CriticalAlarmClusterCount);
        }
        if (source.HighAlarmClusterCount != null) {
            this.HighAlarmClusterCount = new Long(source.HighAlarmClusterCount);
        }
        if (source.CriticalRiskClusterCount != null) {
            this.CriticalRiskClusterCount = new Long(source.CriticalRiskClusterCount);
        }
        if (source.HighRiskClusterCount != null) {
            this.HighRiskClusterCount = new Long(source.HighRiskClusterCount);
        }
        if (source.UnboundUltimateNodeCount != null) {
            this.UnboundUltimateNodeCount = new Long(source.UnboundUltimateNodeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalClusterCount", this.TotalClusterCount);
        this.setParamSimple(map, prefix + "AlarmClusterCount", this.AlarmClusterCount);
        this.setParamSimple(map, prefix + "RiskClusterCount", this.RiskClusterCount);
        this.setParamSimple(map, prefix + "TotalNodeCount", this.TotalNodeCount);
        this.setParamSimple(map, prefix + "TotalCoreCount", this.TotalCoreCount);
        this.setParamSimple(map, prefix + "AlarmEventCount", this.AlarmEventCount);
        this.setParamSimple(map, prefix + "CriticalAlarmEventCount", this.CriticalAlarmEventCount);
        this.setParamSimple(map, prefix + "HighAlarmEventCount", this.HighAlarmEventCount);
        this.setParamSimple(map, prefix + "MiddleAlarmEventCount", this.MiddleAlarmEventCount);
        this.setParamSimple(map, prefix + "LowAlarmEventCount", this.LowAlarmEventCount);
        this.setParamSimple(map, prefix + "RiskEventCount", this.RiskEventCount);
        this.setParamSimple(map, prefix + "CriticalRiskEventCount", this.CriticalRiskEventCount);
        this.setParamSimple(map, prefix + "HighRiskEventCount", this.HighRiskEventCount);
        this.setParamSimple(map, prefix + "MiddleRiskEventCount", this.MiddleRiskEventCount);
        this.setParamSimple(map, prefix + "LowRiskEventCount", this.LowRiskEventCount);
        this.setParamSimple(map, prefix + "UsedCoreQuota", this.UsedCoreQuota);
        this.setParamSimple(map, prefix + "PurchasedCoreQuota", this.PurchasedCoreQuota);
        this.setParamSimple(map, prefix + "ElasticCoreQuota", this.ElasticCoreQuota);
        this.setParamSimple(map, prefix + "UnprotectedCoreCount", this.UnprotectedCoreCount);
        this.setParamSimple(map, prefix + "ProtectedCoreCount", this.ProtectedCoreCount);
        this.setParamSimple(map, prefix + "UnprotectedClusterCount", this.UnprotectedClusterCount);
        this.setParamSimple(map, prefix + "ProtectedClusterCount", this.ProtectedClusterCount);
        this.setParamSimple(map, prefix + "TkeClusterCount", this.TkeClusterCount);
        this.setParamSimple(map, prefix + "SelfBuiltClusterCount", this.SelfBuiltClusterCount);
        this.setParamSimple(map, prefix + "CriticalAlarmClusterCount", this.CriticalAlarmClusterCount);
        this.setParamSimple(map, prefix + "HighAlarmClusterCount", this.HighAlarmClusterCount);
        this.setParamSimple(map, prefix + "CriticalRiskClusterCount", this.CriticalRiskClusterCount);
        this.setParamSimple(map, prefix + "HighRiskClusterCount", this.HighRiskClusterCount);
        this.setParamSimple(map, prefix + "UnboundUltimateNodeCount", this.UnboundUltimateNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

