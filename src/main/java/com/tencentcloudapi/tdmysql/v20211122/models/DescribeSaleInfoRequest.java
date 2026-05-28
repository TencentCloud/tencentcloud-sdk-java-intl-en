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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSaleInfoRequest extends AbstractModel {

    /**
    * <p>Region of the disaster recovery primary instance</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>Instance id</p><p>Input this parameter to return the sales information of the availability zone in the region where this instance is located.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Specify the sales information that supports a certain type instance.</p><p>Enumeration value:</p><ul><li>serverless: Returns all regions that support serverless instance type.</li></ul><p>Default value: None</p><p>Currently only support specifying serverless. Import other info or leave it blank to return all sales region information by default.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>Region of the disaster recovery primary instance</p> 
     * @return SrcRegion <p>Region of the disaster recovery primary instance</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>Region of the disaster recovery primary instance</p>
     * @param SrcRegion <p>Region of the disaster recovery primary instance</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>Instance id</p><p>Input this parameter to return the sales information of the availability zone in the region where this instance is located.</p> 
     * @return InstanceId <p>Instance id</p><p>Input this parameter to return the sales information of the availability zone in the region where this instance is located.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p><p>Input this parameter to return the sales information of the availability zone in the region where this instance is located.</p>
     * @param InstanceId <p>Instance id</p><p>Input this parameter to return the sales information of the availability zone in the region where this instance is located.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Specify the sales information that supports a certain type instance.</p><p>Enumeration value:</p><ul><li>serverless: Returns all regions that support serverless instance type.</li></ul><p>Default value: None</p><p>Currently only support specifying serverless. Import other info or leave it blank to return all sales region information by default.</p> 
     * @return InstanceType <p>Specify the sales information that supports a certain type instance.</p><p>Enumeration value:</p><ul><li>serverless: Returns all regions that support serverless instance type.</li></ul><p>Default value: None</p><p>Currently only support specifying serverless. Import other info or leave it blank to return all sales region information by default.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Specify the sales information that supports a certain type instance.</p><p>Enumeration value:</p><ul><li>serverless: Returns all regions that support serverless instance type.</li></ul><p>Default value: None</p><p>Currently only support specifying serverless. Import other info or leave it blank to return all sales region information by default.</p>
     * @param InstanceType <p>Specify the sales information that supports a certain type instance.</p><p>Enumeration value:</p><ul><li>serverless: Returns all regions that support serverless instance type.</li></ul><p>Default value: None</p><p>Currently only support specifying serverless. Import other info or leave it blank to return all sales region information by default.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DescribeSaleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleInfoRequest(DescribeSaleInfoRequest source) {
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

