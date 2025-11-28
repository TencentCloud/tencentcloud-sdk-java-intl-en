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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicAccessRule extends AbstractModel {

    /**
    * IP Subnet Information
    */
    @SerializedName("IpRule")
    @Expose
    private String IpRule;

    /**
    * Allow or Deny
    */
    @SerializedName("Allow")
    @Expose
    private Boolean Allow;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get IP Subnet Information 
     * @return IpRule IP Subnet Information
     */
    public String getIpRule() {
        return this.IpRule;
    }

    /**
     * Set IP Subnet Information
     * @param IpRule IP Subnet Information
     */
    public void setIpRule(String IpRule) {
        this.IpRule = IpRule;
    }

    /**
     * Get Allow or Deny 
     * @return Allow Allow or Deny
     */
    public Boolean getAllow() {
        return this.Allow;
    }

    /**
     * Set Allow or Deny
     * @param Allow Allow or Deny
     */
    public void setAllow(Boolean Allow) {
        this.Allow = Allow;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public PublicAccessRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicAccessRule(PublicAccessRule source) {
        if (source.IpRule != null) {
            this.IpRule = new String(source.IpRule);
        }
        if (source.Allow != null) {
            this.Allow = new Boolean(source.Allow);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpRule", this.IpRule);
        this.setParamSimple(map, prefix + "Allow", this.Allow);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

