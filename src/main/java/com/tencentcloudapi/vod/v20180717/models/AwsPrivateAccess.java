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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AwsPrivateAccess extends AbstractModel{

    /**
    *  Aws S3 back-to-origin authentication configuration switch, the values are: <li>on:Enable;</li> <li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Access ID.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Key.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * BucketName.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get  Aws S3 back-to-origin authentication configuration switch, the values are: <li>on:Enable;</li> <li>off: Disable.</li> 
     * @return Switch  Aws S3 back-to-origin authentication configuration switch, the values are: <li>on:Enable;</li> <li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set  Aws S3 back-to-origin authentication configuration switch, the values are: <li>on:Enable;</li> <li>off: Disable.</li>
     * @param Switch  Aws S3 back-to-origin authentication configuration switch, the values are: <li>on:Enable;</li> <li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Access ID. 
     * @return AccessKey Access ID.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access ID.
     * @param AccessKey Access ID.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Key. 
     * @return SecretKey Key.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key.
     * @param SecretKey Key.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get BucketName. 
     * @return Bucket BucketName.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set BucketName.
     * @param Bucket BucketName.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    public AwsPrivateAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AwsPrivateAccess(AwsPrivateAccess source) {
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

