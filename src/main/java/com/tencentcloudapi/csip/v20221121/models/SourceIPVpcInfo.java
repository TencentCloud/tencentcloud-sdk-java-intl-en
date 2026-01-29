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

public class SourceIPVpcInfo extends AbstractModel {

    /**
    * Account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * App ID of the VPC.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * vpc id
    */
    @SerializedName("VpcID")
    @Expose
    private String VpcID;

    /**
    * vpc name.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get Account name 
     * @return Name Account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account name
     * @param Name Account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get App ID of the VPC. 
     * @return AppID App ID of the VPC.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set App ID of the VPC.
     * @param AppID App ID of the VPC.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get vpc id 
     * @return VpcID vpc id
     */
    public String getVpcID() {
        return this.VpcID;
    }

    /**
     * Set vpc id
     * @param VpcID vpc id
     */
    public void setVpcID(String VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get vpc name. 
     * @return VpcName vpc name.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc name.
     * @param VpcName vpc name.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    public SourceIPVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceIPVpcInfo(SourceIPVpcInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.VpcID != null) {
            this.VpcID = new String(source.VpcID);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

