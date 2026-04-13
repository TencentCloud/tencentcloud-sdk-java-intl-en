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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneWorkModeRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
    */
    @SerializedName("WorkModeInfos")
    @Expose
    private ConfigGroupWorkModeInfo [] WorkModeInfos;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1). 
     * @return WorkModeInfos Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     */
    public ConfigGroupWorkModeInfo [] getWorkModeInfos() {
        return this.WorkModeInfos;
    }

    /**
     * Set Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     * @param WorkModeInfos Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     */
    public void setWorkModeInfos(ConfigGroupWorkModeInfo [] WorkModeInfos) {
        this.WorkModeInfos = WorkModeInfos;
    }

    public ModifyZoneWorkModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneWorkModeRequest(ModifyZoneWorkModeRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.WorkModeInfos != null) {
            this.WorkModeInfos = new ConfigGroupWorkModeInfo[source.WorkModeInfos.length];
            for (int i = 0; i < source.WorkModeInfos.length; i++) {
                this.WorkModeInfos[i] = new ConfigGroupWorkModeInfo(source.WorkModeInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "WorkModeInfos.", this.WorkModeInfos);

    }
}

