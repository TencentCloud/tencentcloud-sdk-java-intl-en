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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwCidrInfo extends AbstractModel{

    /**
    * The IP range type of the firewall. Values: `VpcSelf` (VPC IP range preferred); `Assis` (Secondary IP range preferred); `Custom` (Custom IP range)
    */
    @SerializedName("FwCidrType")
    @Expose
    private String FwCidrType;

    /**
    * The IP segment assigned for each VPC.
    */
    @SerializedName("FwCidrLst")
    @Expose
    private FwVpcCidr [] FwCidrLst;

    /**
    * The IP segment used by other firewalls. Specify this if you want to assign a dedicated segment for the firewall.
    */
    @SerializedName("ComFwCidr")
    @Expose
    private String ComFwCidr;

    /**
     * Get The IP range type of the firewall. Values: `VpcSelf` (VPC IP range preferred); `Assis` (Secondary IP range preferred); `Custom` (Custom IP range) 
     * @return FwCidrType The IP range type of the firewall. Values: `VpcSelf` (VPC IP range preferred); `Assis` (Secondary IP range preferred); `Custom` (Custom IP range)
     */
    public String getFwCidrType() {
        return this.FwCidrType;
    }

    /**
     * Set The IP range type of the firewall. Values: `VpcSelf` (VPC IP range preferred); `Assis` (Secondary IP range preferred); `Custom` (Custom IP range)
     * @param FwCidrType The IP range type of the firewall. Values: `VpcSelf` (VPC IP range preferred); `Assis` (Secondary IP range preferred); `Custom` (Custom IP range)
     */
    public void setFwCidrType(String FwCidrType) {
        this.FwCidrType = FwCidrType;
    }

    /**
     * Get The IP segment assigned for each VPC. 
     * @return FwCidrLst The IP segment assigned for each VPC.
     */
    public FwVpcCidr [] getFwCidrLst() {
        return this.FwCidrLst;
    }

    /**
     * Set The IP segment assigned for each VPC.
     * @param FwCidrLst The IP segment assigned for each VPC.
     */
    public void setFwCidrLst(FwVpcCidr [] FwCidrLst) {
        this.FwCidrLst = FwCidrLst;
    }

    /**
     * Get The IP segment used by other firewalls. Specify this if you want to assign a dedicated segment for the firewall. 
     * @return ComFwCidr The IP segment used by other firewalls. Specify this if you want to assign a dedicated segment for the firewall.
     */
    public String getComFwCidr() {
        return this.ComFwCidr;
    }

    /**
     * Set The IP segment used by other firewalls. Specify this if you want to assign a dedicated segment for the firewall.
     * @param ComFwCidr The IP segment used by other firewalls. Specify this if you want to assign a dedicated segment for the firewall.
     */
    public void setComFwCidr(String ComFwCidr) {
        this.ComFwCidr = ComFwCidr;
    }

    public FwCidrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwCidrInfo(FwCidrInfo source) {
        if (source.FwCidrType != null) {
            this.FwCidrType = new String(source.FwCidrType);
        }
        if (source.FwCidrLst != null) {
            this.FwCidrLst = new FwVpcCidr[source.FwCidrLst.length];
            for (int i = 0; i < source.FwCidrLst.length; i++) {
                this.FwCidrLst[i] = new FwVpcCidr(source.FwCidrLst[i]);
            }
        }
        if (source.ComFwCidr != null) {
            this.ComFwCidr = new String(source.ComFwCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwCidrType", this.FwCidrType);
        this.setParamArrayObj(map, prefix + "FwCidrLst.", this.FwCidrLst);
        this.setParamSimple(map, prefix + "ComFwCidr", this.ComFwCidr);

    }
}

