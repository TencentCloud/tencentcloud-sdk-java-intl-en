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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuStorageParams extends AbstractModel {

    /**
    * Third-Party Cloud Storage Account Information
(Note: Storing files in Object Storage COS will incur recording file delivery fees. For details, see [Cloud Recording Billing]. Storing in VOD does not incur this fee.)
Example:{"Vendor":0,"Region":"ap-shanghai","Bucket":"*","AccessKey":"*","SecretKey":"***","FileNamePrefix":["mcu_record"]}
    */
    @SerializedName("CloudStorage")
    @Expose
    private CloudStorage CloudStorage;

    /**
    * Tencent Cloud VOD Account Information
Example:{"McuTencentVod":{"ExpireTime":86400}}
    */
    @SerializedName("McuCloudVod")
    @Expose
    private McuCloudVod McuCloudVod;

    /**
     * Get Third-Party Cloud Storage Account Information
(Note: Storing files in Object Storage COS will incur recording file delivery fees. For details, see [Cloud Recording Billing]. Storing in VOD does not incur this fee.)
Example:{"Vendor":0,"Region":"ap-shanghai","Bucket":"*","AccessKey":"*","SecretKey":"***","FileNamePrefix":["mcu_record"]} 
     * @return CloudStorage Third-Party Cloud Storage Account Information
(Note: Storing files in Object Storage COS will incur recording file delivery fees. For details, see [Cloud Recording Billing]. Storing in VOD does not incur this fee.)
Example:{"Vendor":0,"Region":"ap-shanghai","Bucket":"*","AccessKey":"*","SecretKey":"***","FileNamePrefix":["mcu_record"]}
     */
    public CloudStorage getCloudStorage() {
        return this.CloudStorage;
    }

    /**
     * Set Third-Party Cloud Storage Account Information
(Note: Storing files in Object Storage COS will incur recording file delivery fees. For details, see [Cloud Recording Billing]. Storing in VOD does not incur this fee.)
Example:{"Vendor":0,"Region":"ap-shanghai","Bucket":"*","AccessKey":"*","SecretKey":"***","FileNamePrefix":["mcu_record"]}
     * @param CloudStorage Third-Party Cloud Storage Account Information
(Note: Storing files in Object Storage COS will incur recording file delivery fees. For details, see [Cloud Recording Billing]. Storing in VOD does not incur this fee.)
Example:{"Vendor":0,"Region":"ap-shanghai","Bucket":"*","AccessKey":"*","SecretKey":"***","FileNamePrefix":["mcu_record"]}
     */
    public void setCloudStorage(CloudStorage CloudStorage) {
        this.CloudStorage = CloudStorage;
    }

    /**
     * Get Tencent Cloud VOD Account Information
Example:{"McuTencentVod":{"ExpireTime":86400}} 
     * @return McuCloudVod Tencent Cloud VOD Account Information
Example:{"McuTencentVod":{"ExpireTime":86400}}
     */
    public McuCloudVod getMcuCloudVod() {
        return this.McuCloudVod;
    }

    /**
     * Set Tencent Cloud VOD Account Information
Example:{"McuTencentVod":{"ExpireTime":86400}}
     * @param McuCloudVod Tencent Cloud VOD Account Information
Example:{"McuTencentVod":{"ExpireTime":86400}}
     */
    public void setMcuCloudVod(McuCloudVod McuCloudVod) {
        this.McuCloudVod = McuCloudVod;
    }

    public McuStorageParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuStorageParams(McuStorageParams source) {
        if (source.CloudStorage != null) {
            this.CloudStorage = new CloudStorage(source.CloudStorage);
        }
        if (source.McuCloudVod != null) {
            this.McuCloudVod = new McuCloudVod(source.McuCloudVod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CloudStorage.", this.CloudStorage);
        this.setParamObj(map, prefix + "McuCloudVod.", this.McuCloudVod);

    }
}

