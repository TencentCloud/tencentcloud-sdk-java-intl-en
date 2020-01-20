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

public class CreateCcnRequest extends AbstractModel{

    /**
    * The name of the CCN. The maximum length is 60 characters.
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * The description of the CCN. The maximum length is 100 characters.
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * CCN service quality, 'PT': Platinum, 'AU': Gold, 'AG': Silver. The default is ‘AU’.
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * The billing method. POSTPAID: postpaid by traffic. Default: POSTPAID.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * The bandwidth limit type. OUTER_REGION_LIMIT: regional outbound limit. INTER_REGION_LIMIT: inter-regional limit. Default: OUTER_REGION_LIMIT.
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
     * Get The name of the CCN. The maximum length is 60 characters. 
     * @return CcnName The name of the CCN. The maximum length is 60 characters.
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set The name of the CCN. The maximum length is 60 characters.
     * @param CcnName The name of the CCN. The maximum length is 60 characters.
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get The description of the CCN. The maximum length is 100 characters. 
     * @return CcnDescription The description of the CCN. The maximum length is 100 characters.
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set The description of the CCN. The maximum length is 100 characters.
     * @param CcnDescription The description of the CCN. The maximum length is 100 characters.
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get CCN service quality, 'PT': Platinum, 'AU': Gold, 'AG': Silver. The default is ‘AU’. 
     * @return QosLevel CCN service quality, 'PT': Platinum, 'AU': Gold, 'AG': Silver. The default is ‘AU’.
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set CCN service quality, 'PT': Platinum, 'AU': Gold, 'AG': Silver. The default is ‘AU’.
     * @param QosLevel CCN service quality, 'PT': Platinum, 'AU': Gold, 'AG': Silver. The default is ‘AU’.
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get The billing method. POSTPAID: postpaid by traffic. Default: POSTPAID. 
     * @return InstanceChargeType The billing method. POSTPAID: postpaid by traffic. Default: POSTPAID.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set The billing method. POSTPAID: postpaid by traffic. Default: POSTPAID.
     * @param InstanceChargeType The billing method. POSTPAID: postpaid by traffic. Default: POSTPAID.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get The bandwidth limit type. OUTER_REGION_LIMIT: regional outbound limit. INTER_REGION_LIMIT: inter-regional limit. Default: OUTER_REGION_LIMIT. 
     * @return BandwidthLimitType The bandwidth limit type. OUTER_REGION_LIMIT: regional outbound limit. INTER_REGION_LIMIT: inter-regional limit. Default: OUTER_REGION_LIMIT.
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set The bandwidth limit type. OUTER_REGION_LIMIT: regional outbound limit. INTER_REGION_LIMIT: inter-regional limit. Default: OUTER_REGION_LIMIT.
     * @param BandwidthLimitType The bandwidth limit type. OUTER_REGION_LIMIT: regional outbound limit. INTER_REGION_LIMIT: inter-regional limit. Default: OUTER_REGION_LIMIT.
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "BandwidthLimitType", this.BandwidthLimitType);

    }
}

