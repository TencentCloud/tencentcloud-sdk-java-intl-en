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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * Type. Values:
`URL`: Resource link
`COS`: Tencent Cloud COS
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Resource link
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Tencent Cloud bucket information
    */
    @SerializedName("BucketInfo")
    @Expose
    private BucketInfo BucketInfo;

    /**
     * Get Type. Values:
`URL`: Resource link
`COS`: Tencent Cloud COS 
     * @return Type Type. Values:
`URL`: Resource link
`COS`: Tencent Cloud COS
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Values:
`URL`: Resource link
`COS`: Tencent Cloud COS
     * @param Type Type. Values:
`URL`: Resource link
`COS`: Tencent Cloud COS
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Resource link 
     * @return Url Resource link
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Resource link
     * @param Url Resource link
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Tencent Cloud bucket information 
     * @return BucketInfo Tencent Cloud bucket information
     */
    public BucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set Tencent Cloud bucket information
     * @param BucketInfo Tencent Cloud bucket information
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

