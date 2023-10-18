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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceBasicInfo extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Private IP of the instance.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private port of the instance.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Instance service.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance engine version.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Private IP of the instance. 
     * @return Vip Private IP of the instance.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP of the instance.
     * @param Vip Private IP of the instance.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private port of the instance. 
     * @return Vport Private port of the instance.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private port of the instance.
     * @param Vport Private port of the instance.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Instance service. 
     * @return Product Instance service.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Instance service.
     * @param Product Instance service.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance engine version. 
     * @return EngineVersion Instance engine version.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Instance engine version.
     * @param EngineVersion Instance engine version.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    public InstanceBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceBasicInfo(InstanceBasicInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);

    }
}

