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
    * Account information for third-party cloud storage (special note: if you select storage to cloud object storage (COS), there will be a charge for shipping recorded files to COS. for details, see cloud recording pricing information. storing to VOD will incur no charge for this item.).
    */
    @SerializedName("CloudStorage")
    @Expose
    private CloudStorage CloudStorage;

    /**
    * Account information of tencent cloud vod.
    */
    @SerializedName("McuCloudVod")
    @Expose
    private McuCloudVod McuCloudVod;

    /**
     * Get Account information for third-party cloud storage (special note: if you select storage to cloud object storage (COS), there will be a charge for shipping recorded files to COS. for details, see cloud recording pricing information. storing to VOD will incur no charge for this item.). 
     * @return CloudStorage Account information for third-party cloud storage (special note: if you select storage to cloud object storage (COS), there will be a charge for shipping recorded files to COS. for details, see cloud recording pricing information. storing to VOD will incur no charge for this item.).
     */
    public CloudStorage getCloudStorage() {
        return this.CloudStorage;
    }

    /**
     * Set Account information for third-party cloud storage (special note: if you select storage to cloud object storage (COS), there will be a charge for shipping recorded files to COS. for details, see cloud recording pricing information. storing to VOD will incur no charge for this item.).
     * @param CloudStorage Account information for third-party cloud storage (special note: if you select storage to cloud object storage (COS), there will be a charge for shipping recorded files to COS. for details, see cloud recording pricing information. storing to VOD will incur no charge for this item.).
     */
    public void setCloudStorage(CloudStorage CloudStorage) {
        this.CloudStorage = CloudStorage;
    }

    /**
     * Get Account information of tencent cloud vod. 
     * @return McuCloudVod Account information of tencent cloud vod.
     */
    public McuCloudVod getMcuCloudVod() {
        return this.McuCloudVod;
    }

    /**
     * Set Account information of tencent cloud vod.
     * @param McuCloudVod Account information of tencent cloud vod.
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

