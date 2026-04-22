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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGVersionRequest extends AbstractModel {

    /**
    * <p>Task ID returned by the CreateMNPVersion API.</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * <p>Platform ID</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get <p>Task ID returned by the CreateMNPVersion API.</p> 
     * @return BusinessId <p>Task ID returned by the CreateMNPVersion API.</p>
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>Task ID returned by the CreateMNPVersion API.</p>
     * @param BusinessId <p>Task ID returned by the CreateMNPVersion API.</p>
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>Platform ID</p> 
     * @return PlatformId <p>Platform ID</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID</p>
     * @param PlatformId <p>Platform ID</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public DescribeMNGVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGVersionRequest(DescribeMNGVersionRequest source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

