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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestinationSyncConfig extends AbstractModel {

    /**
    * Specifies the target region of the synchronization task.
    */
    @SerializedName("DestinationRegion")
    @Expose
    private String DestinationRegion;

    /**
    * HsmClusterId being empty indicates public cloud shared version. if not empty, it indicates exclusive edition cluster in the region.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
     * Get Specifies the target region of the synchronization task. 
     * @return DestinationRegion Specifies the target region of the synchronization task.
     */
    public String getDestinationRegion() {
        return this.DestinationRegion;
    }

    /**
     * Set Specifies the target region of the synchronization task.
     * @param DestinationRegion Specifies the target region of the synchronization task.
     */
    public void setDestinationRegion(String DestinationRegion) {
        this.DestinationRegion = DestinationRegion;
    }

    /**
     * Get HsmClusterId being empty indicates public cloud shared version. if not empty, it indicates exclusive edition cluster in the region. 
     * @return HsmClusterId HsmClusterId being empty indicates public cloud shared version. if not empty, it indicates exclusive edition cluster in the region.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HsmClusterId being empty indicates public cloud shared version. if not empty, it indicates exclusive edition cluster in the region.
     * @param HsmClusterId HsmClusterId being empty indicates public cloud shared version. if not empty, it indicates exclusive edition cluster in the region.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    public DestinationSyncConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestinationSyncConfig(DestinationSyncConfig source) {
        if (source.DestinationRegion != null) {
            this.DestinationRegion = new String(source.DestinationRegion);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationRegion", this.DestinationRegion);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);

    }
}

