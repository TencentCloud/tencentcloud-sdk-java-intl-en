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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * This field indicates the file access type. Valid values: **URL** (resource link), **COS** (Tencent Cloud COS). It should correspond to the access type passed in and can be used for strict verification and quick identification of the access address. If you don't pass in this parameter, the default value will be `URL`, and the system will automatically determine the access address type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This field indicates the link address for file access in standard URL format.<br>Note: when `Type` is `URL`, this field will not be empty. You must pass in either this parameter or the `BucketInfo` parameter.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * This field indicates the Tencent Cloud bucket information for file access.<br>Note: when `Type` is `COS`, this field will not be empty. You must pass in either this parameter or the `Url` parameter.
    */
    @SerializedName("BucketInfo")
    @Expose
    private BucketInfo BucketInfo;

    /**
     * Get This field indicates the file access type. Valid values: **URL** (resource link), **COS** (Tencent Cloud COS). It should correspond to the access type passed in and can be used for strict verification and quick identification of the access address. If you don't pass in this parameter, the default value will be `URL`, and the system will automatically determine the access address type. 
     * @return Type This field indicates the file access type. Valid values: **URL** (resource link), **COS** (Tencent Cloud COS). It should correspond to the access type passed in and can be used for strict verification and quick identification of the access address. If you don't pass in this parameter, the default value will be `URL`, and the system will automatically determine the access address type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set This field indicates the file access type. Valid values: **URL** (resource link), **COS** (Tencent Cloud COS). It should correspond to the access type passed in and can be used for strict verification and quick identification of the access address. If you don't pass in this parameter, the default value will be `URL`, and the system will automatically determine the access address type.
     * @param Type This field indicates the file access type. Valid values: **URL** (resource link), **COS** (Tencent Cloud COS). It should correspond to the access type passed in and can be used for strict verification and quick identification of the access address. If you don't pass in this parameter, the default value will be `URL`, and the system will automatically determine the access address type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This field indicates the link address for file access in standard URL format.<br>Note: when `Type` is `URL`, this field will not be empty. You must pass in either this parameter or the `BucketInfo` parameter. 
     * @return Url This field indicates the link address for file access in standard URL format.<br>Note: when `Type` is `URL`, this field will not be empty. You must pass in either this parameter or the `BucketInfo` parameter.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set This field indicates the link address for file access in standard URL format.<br>Note: when `Type` is `URL`, this field will not be empty. You must pass in either this parameter or the `BucketInfo` parameter.
     * @param Url This field indicates the link address for file access in standard URL format.<br>Note: when `Type` is `URL`, this field will not be empty. You must pass in either this parameter or the `BucketInfo` parameter.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get This field indicates the Tencent Cloud bucket information for file access.<br>Note: when `Type` is `COS`, this field will not be empty. You must pass in either this parameter or the `Url` parameter. 
     * @return BucketInfo This field indicates the Tencent Cloud bucket information for file access.<br>Note: when `Type` is `COS`, this field will not be empty. You must pass in either this parameter or the `Url` parameter.
     */
    public BucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set This field indicates the Tencent Cloud bucket information for file access.<br>Note: when `Type` is `COS`, this field will not be empty. You must pass in either this parameter or the `Url` parameter.
     * @param BucketInfo This field indicates the Tencent Cloud bucket information for file access.<br>Note: when `Type` is `COS`, this field will not be empty. You must pass in either this parameter or the `Url` parameter.
     */
    public void setBucketInfo(BucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new BucketInfo(source.BucketInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "BucketInfo.", this.BucketInfo);

    }
}

