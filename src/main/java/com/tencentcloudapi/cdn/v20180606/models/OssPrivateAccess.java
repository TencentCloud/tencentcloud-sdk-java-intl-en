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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OssPrivateAccess extends AbstractModel {

    /**
    * Whether to enable OSS origin-pull authentication. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Access ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Key.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Region
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * BucketName
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get Whether to enable OSS origin-pull authentication. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable OSS origin-pull authentication. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable OSS origin-pull authentication. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable OSS origin-pull authentication. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Access ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AccessKey Access ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AccessKey Access ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Key.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SecretKey Key.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SecretKey Key.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Region
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Region Region
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Region Region
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get BucketName
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Bucket BucketName
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set BucketName
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Bucket BucketName
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    public OssPrivateAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OssPrivateAccess(OssPrivateAccess source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

