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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerAttributesRequest extends AbstractModel {

    /**
    * Unique CLB ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * The backend service information of cross-region binding 1.0
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * Network billing parameter
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
    * Whether the target opens traffic from CLB to the internet. If yes (true), only security groups on CLB will be verified; if no (false), security groups on both CLB and backend instance need to be verified.
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * Whether to enable cross-region binding 2.0
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * Specifies whether to enable deletion protection.
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * Modifies the second-level domain name of CLB from mycloud.com to tencentclb.com. Note that the sub-domain names will be changed as well. After the modification, mycloud.com will be invalidated. 
    */
    @SerializedName("ModifyClassicDomain")
    @Expose
    private Boolean ModifyClassicDomain;

    /**
     * Get Unique CLB ID 
     * @return LoadBalancerId Unique CLB ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Unique CLB ID
     * @param LoadBalancerId Unique CLB ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name 
     * @return LoadBalancerName CLB instance name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
     * @param LoadBalancerName CLB instance name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get The backend service information of cross-region binding 1.0 
     * @return TargetRegionInfo The backend service information of cross-region binding 1.0
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set The backend service information of cross-region binding 1.0
     * @param TargetRegionInfo The backend service information of cross-region binding 1.0
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get Network billing parameter 
     * @return InternetChargeInfo Network billing parameter
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set Network billing parameter
     * @param InternetChargeInfo Network billing parameter
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Get Whether the target opens traffic from CLB to the internet. If yes (true), only security groups on CLB will be verified; if no (false), security groups on both CLB and backend instance need to be verified. 
     * @return LoadBalancerPassToTarget Whether the target opens traffic from CLB to the internet. If yes (true), only security groups on CLB will be verified; if no (false), security groups on both CLB and backend instance need to be verified.
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Whether the target opens traffic from CLB to the internet. If yes (true), only security groups on CLB will be verified; if no (false), security groups on both CLB and backend instance need to be verified.
     * @param LoadBalancerPassToTarget Whether the target opens traffic from CLB to the internet. If yes (true), only security groups on CLB will be verified; if no (false), security groups on both CLB and backend instance need to be verified.
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get Whether to enable cross-region binding 2.0 
     * @return SnatPro Whether to enable cross-region binding 2.0
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set Whether to enable cross-region binding 2.0
     * @param SnatPro Whether to enable cross-region binding 2.0
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get Specifies whether to enable deletion protection. 
     * @return DeleteProtect Specifies whether to enable deletion protection.
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set Specifies whether to enable deletion protection.
     * @param DeleteProtect Specifies whether to enable deletion protection.
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get Modifies the second-level domain name of CLB from mycloud.com to tencentclb.com. Note that the sub-domain names will be changed as well. After the modification, mycloud.com will be invalidated.  
     * @return ModifyClassicDomain Modifies the second-level domain name of CLB from mycloud.com to tencentclb.com. Note that the sub-domain names will be changed as well. After the modification, mycloud.com will be invalidated. 
     */
    public Boolean getModifyClassicDomain() {
        return this.ModifyClassicDomain;
    }

    /**
     * Set Modifies the second-level domain name of CLB from mycloud.com to tencentclb.com. Note that the sub-domain names will be changed as well. After the modification, mycloud.com will be invalidated. 
     * @param ModifyClassicDomain Modifies the second-level domain name of CLB from mycloud.com to tencentclb.com. Note that the sub-domain names will be changed as well. After the modification, mycloud.com will be invalidated. 
     */
    public void setModifyClassicDomain(Boolean ModifyClassicDomain) {
        this.ModifyClassicDomain = ModifyClassicDomain;
    }

    public ModifyLoadBalancerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAttributesRequest(ModifyLoadBalancerAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.TargetRegionInfo != null) {
            this.TargetRegionInfo = new TargetRegionInfo(source.TargetRegionInfo);
        }
        if (source.InternetChargeInfo != null) {
            this.InternetChargeInfo = new InternetAccessible(source.InternetChargeInfo);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.ModifyClassicDomain != null) {
            this.ModifyClassicDomain = new Boolean(source.ModifyClassicDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamSimple(map, prefix + "ModifyClassicDomain", this.ModifyClassicDomain);

    }
}

