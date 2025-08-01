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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceEventStatusRequest extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 0: pending; 2: processed; 3: ignored; 4: deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Event ID 
     * @return Ids Event ID
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Event ID
     * @param Ids Event ID
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 0: pending; 2: processed; 3: ignored; 4: deleted. 
     * @return Status 0: pending; 2: processed; 3: ignored; 4: deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: pending; 2: processed; 3: ignored; 4: deleted.
     * @param Status 0: pending; 2: processed; 3: ignored; 4: deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyVulDefenceEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceEventStatusRequest(ModifyVulDefenceEventStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

