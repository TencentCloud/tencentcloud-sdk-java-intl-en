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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayRequest extends AbstractModel {

    /**
    * Cloud native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Cloud Native API Gateway name, supports up to 60 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cloud native API gateway description, supports up to 120 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether CLS log is enabled. The value can only be true temporarily, meaning it can only be changed from disabled to enabled.
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * Public network billing mode. Option values: BANDWIDTH | TRAFFIC, which means billing by bandwidth or by traffic.
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * Enable instance deletion protection, default false
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
     * Get Cloud native API gateway instance ID. 
     * @return GatewayId Cloud native API gateway instance ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud native API gateway instance ID.
     * @param GatewayId Cloud native API gateway instance ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Cloud Native API Gateway name, supports up to 60 characters. 
     * @return Name Cloud Native API Gateway name, supports up to 60 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cloud Native API Gateway name, supports up to 60 characters.
     * @param Name Cloud Native API Gateway name, supports up to 60 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cloud native API gateway description, supports up to 120 characters. 
     * @return Description Cloud native API gateway description, supports up to 120 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Cloud native API gateway description, supports up to 120 characters.
     * @param Description Cloud native API gateway description, supports up to 120 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether CLS log is enabled. The value can only be true temporarily, meaning it can only be changed from disabled to enabled. 
     * @return EnableCls Whether CLS log is enabled. The value can only be true temporarily, meaning it can only be changed from disabled to enabled.
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set Whether CLS log is enabled. The value can only be true temporarily, meaning it can only be changed from disabled to enabled.
     * @param EnableCls Whether CLS log is enabled. The value can only be true temporarily, meaning it can only be changed from disabled to enabled.
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get Public network billing mode. Option values: BANDWIDTH | TRAFFIC, which means billing by bandwidth or by traffic. 
     * @return InternetPayMode Public network billing mode. Option values: BANDWIDTH | TRAFFIC, which means billing by bandwidth or by traffic.
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set Public network billing mode. Option values: BANDWIDTH | TRAFFIC, which means billing by bandwidth or by traffic.
     * @param InternetPayMode Public network billing mode. Option values: BANDWIDTH | TRAFFIC, which means billing by bandwidth or by traffic.
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get Enable instance deletion protection, default false 
     * @return DeleteProtect Enable instance deletion protection, default false
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set Enable instance deletion protection, default false
     * @param DeleteProtect Enable instance deletion protection, default false
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    public ModifyCloudNativeAPIGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayRequest(ModifyCloudNativeAPIGatewayRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);

    }
}

