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

public class DeleteSharedCNAMERequest extends AbstractModel {

    /**
    * ID of the site to which the shared CNAME belongs.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The shared CNAME to be deleted
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
     * Get ID of the site to which the shared CNAME belongs. 
     * @return ZoneId ID of the site to which the shared CNAME belongs.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site to which the shared CNAME belongs.
     * @param ZoneId ID of the site to which the shared CNAME belongs.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The shared CNAME to be deleted 
     * @return SharedCNAME The shared CNAME to be deleted
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set The shared CNAME to be deleted
     * @param SharedCNAME The shared CNAME to be deleted
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    public DeleteSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSharedCNAMERequest(DeleteSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);

    }
}

