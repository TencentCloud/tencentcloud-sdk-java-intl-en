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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BucketInfo extends AbstractModel {

    /**
    * This field indicates a bucket name in Tencent Cloud COS. For more information on buckets, see Basic Concepts (https://intl.cloud.tencent.com/document/product/436/44352?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * This field indicates a region where a Tencent Cloud COS managed data center is deployed. COS data is stored in buckets in these regions. 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * This field indicates an object key in Tencent Cloud COS. Object z is stored in a bucket as a basic storage unit. You can manage objects through the Tencent Cloud console, API, or SDK. For more information on objects, see Object Overview (https://intl.cloud.tencent.com/document/product/436/13324?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
     * Get This field indicates a bucket name in Tencent Cloud COS. For more information on buckets, see Basic Concepts (https://intl.cloud.tencent.com/document/product/436/44352?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bucket This field indicates a bucket name in Tencent Cloud COS. For more information on buckets, see Basic Concepts (https://intl.cloud.tencent.com/document/product/436/44352?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set This field indicates a bucket name in Tencent Cloud COS. For more information on buckets, see Basic Concepts (https://intl.cloud.tencent.com/document/product/436/44352?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bucket This field indicates a bucket name in Tencent Cloud COS. For more information on buckets, see Basic Concepts (https://intl.cloud.tencent.com/document/product/436/44352?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get This field indicates a region where a Tencent Cloud COS managed data center is deployed. COS data is stored in buckets in these regions. 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region This field indicates a region where a Tencent Cloud COS managed data center is deployed. COS data is stored in buckets in these regions. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set This field indicates a region where a Tencent Cloud COS managed data center is deployed. COS data is stored in buckets in these regions. 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region This field indicates a region where a Tencent Cloud COS managed data center is deployed. COS data is stored in buckets in these regions. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get This field indicates an object key in Tencent Cloud COS. Object z is stored in a bucket as a basic storage unit. You can manage objects through the Tencent Cloud console, API, or SDK. For more information on objects, see Object Overview (https://intl.cloud.tencent.com/document/product/436/13324?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Object This field indicates an object key in Tencent Cloud COS. Object z is stored in a bucket as a basic storage unit. You can manage objects through the Tencent Cloud console, API, or SDK. For more information on objects, see Object Overview (https://intl.cloud.tencent.com/document/product/436/13324?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set This field indicates an object key in Tencent Cloud COS. Object z is stored in a bucket as a basic storage unit. You can manage objects through the Tencent Cloud console, API, or SDK. For more information on objects, see Object Overview (https://intl.cloud.tencent.com/document/product/436/13324?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Object This field indicates an object key in Tencent Cloud COS. Object z is stored in a bucket as a basic storage unit. You can manage objects through the Tencent Cloud console, API, or SDK. For more information on objects, see Object Overview (https://intl.cloud.tencent.com/document/product/436/13324?from_cn_redirect=1). 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    public BucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BucketInfo(BucketInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);

    }
}

