/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCN extends AbstractModel{

    /**
    * The unique ID of the CCN
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * The name of the CCN
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * The detailed information of the CCN
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * The number of associated instances
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * The creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The instance status. 'ISOLATED': Being isolated (instance is in arrears and service is suspended). 'AVAILABLE': Operating.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The instance service quality. ’PT’: Platinum , 'AU': Gold, 'AG': Silver.
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * The billing method. POSTPAID indicates postpaid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * The limit type. INTER_REGION_LIMIT is the limit between regions. OUTER_REGION_LIMIT is a region egress limit.
Note: This field may return null, indicating no valid value.
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
     * Get The unique ID of the CCN 
     * @return CcnId The unique ID of the CCN
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set The unique ID of the CCN
     * @param CcnId The unique ID of the CCN
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get The name of the CCN 
     * @return CcnName The name of the CCN
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set The name of the CCN
     * @param CcnName The name of the CCN
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get The detailed information of the CCN 
     * @return CcnDescription The detailed information of the CCN
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set The detailed information of the CCN
     * @param CcnDescription The detailed information of the CCN
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get The number of associated instances 
     * @return InstanceCount The number of associated instances
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set The number of associated instances
     * @param InstanceCount The number of associated instances
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get The creation time 
     * @return CreateTime The creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time
     * @param CreateTime The creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The instance status. 'ISOLATED': Being isolated (instance is in arrears and service is suspended). 'AVAILABLE': Operating. 
     * @return State The instance status. 'ISOLATED': Being isolated (instance is in arrears and service is suspended). 'AVAILABLE': Operating.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The instance status. 'ISOLATED': Being isolated (instance is in arrears and service is suspended). 'AVAILABLE': Operating.
     * @param State The instance status. 'ISOLATED': Being isolated (instance is in arrears and service is suspended). 'AVAILABLE': Operating.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The instance service quality. ’PT’: Platinum , 'AU': Gold, 'AG': Silver. 
     * @return QosLevel The instance service quality. ’PT’: Platinum , 'AU': Gold, 'AG': Silver.
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set The instance service quality. ’PT’: Platinum , 'AU': Gold, 'AG': Silver.
     * @param QosLevel The instance service quality. ’PT’: Platinum , 'AU': Gold, 'AG': Silver.
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get The billing method. POSTPAID indicates postpaid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceChargeType The billing method. POSTPAID indicates postpaid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The billing method. POSTPAID indicates postpaid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceChargeType The billing method. POSTPAID indicates postpaid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get The limit type. INTER_REGION_LIMIT is the limit between regions. OUTER_REGION_LIMIT is a region egress limit.
Note: This field may return null, indicating no valid value. 
     * @return BandwidthLimitType The limit type. INTER_REGION_LIMIT is the limit between regions. OUTER_REGION_LIMIT is a region egress limit.
Note: This field may return null, indicating no valid value.
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set The limit type. INTER_REGION_LIMIT is the limit between regions. OUTER_REGION_LIMIT is a region egress limit.
Note: This field may return null, indicating no valid value.
     * @param BandwidthLimitType The limit type. INTER_REGION_LIMIT is the limit between regions. OUTER_REGION_LIMIT is a region egress limit.
Note: This field may return null, indicating no valid value.
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "BandwidthLimitType", this.BandwidthLimitType);

    }
}

