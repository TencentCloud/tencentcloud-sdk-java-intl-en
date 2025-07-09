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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneAccountRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Source user account name
    */
    @SerializedName("SrcUser")
    @Expose
    private String SrcUser;

    /**
    * Source user host
    */
    @SerializedName("SrcHost")
    @Expose
    private String SrcHost;

    /**
    * Target user account name
    */
    @SerializedName("DstUser")
    @Expose
    private String DstUser;

    /**
    * Target user host
    */
    @SerializedName("DstHost")
    @Expose
    private String DstHost;

    /**
    * Target account description
    */
    @SerializedName("DstDesc")
    @Expose
    private String DstDesc;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Source user account name 
     * @return SrcUser Source user account name
     */
    public String getSrcUser() {
        return this.SrcUser;
    }

    /**
     * Set Source user account name
     * @param SrcUser Source user account name
     */
    public void setSrcUser(String SrcUser) {
        this.SrcUser = SrcUser;
    }

    /**
     * Get Source user host 
     * @return SrcHost Source user host
     */
    public String getSrcHost() {
        return this.SrcHost;
    }

    /**
     * Set Source user host
     * @param SrcHost Source user host
     */
    public void setSrcHost(String SrcHost) {
        this.SrcHost = SrcHost;
    }

    /**
     * Get Target user account name 
     * @return DstUser Target user account name
     */
    public String getDstUser() {
        return this.DstUser;
    }

    /**
     * Set Target user account name
     * @param DstUser Target user account name
     */
    public void setDstUser(String DstUser) {
        this.DstUser = DstUser;
    }

    /**
     * Get Target user host 
     * @return DstHost Target user host
     */
    public String getDstHost() {
        return this.DstHost;
    }

    /**
     * Set Target user host
     * @param DstHost Target user host
     */
    public void setDstHost(String DstHost) {
        this.DstHost = DstHost;
    }

    /**
     * Get Target account description 
     * @return DstDesc Target account description
     */
    public String getDstDesc() {
        return this.DstDesc;
    }

    /**
     * Set Target account description
     * @param DstDesc Target account description
     */
    public void setDstDesc(String DstDesc) {
        this.DstDesc = DstDesc;
    }

    public CloneAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneAccountRequest(CloneAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SrcUser != null) {
            this.SrcUser = new String(source.SrcUser);
        }
        if (source.SrcHost != null) {
            this.SrcHost = new String(source.SrcHost);
        }
        if (source.DstUser != null) {
            this.DstUser = new String(source.DstUser);
        }
        if (source.DstHost != null) {
            this.DstHost = new String(source.DstHost);
        }
        if (source.DstDesc != null) {
            this.DstDesc = new String(source.DstDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcUser", this.SrcUser);
        this.setParamSimple(map, prefix + "SrcHost", this.SrcHost);
        this.setParamSimple(map, prefix + "DstUser", this.DstUser);
        this.setParamSimple(map, prefix + "DstHost", this.DstHost);
        this.setParamSimple(map, prefix + "DstDesc", this.DstDesc);

    }
}

