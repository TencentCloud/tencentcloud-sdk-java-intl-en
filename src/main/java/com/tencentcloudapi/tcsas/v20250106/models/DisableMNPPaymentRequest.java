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

public class DisableMNPPaymentRequest extends AbstractModel {

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Primary key ID, obtained from the API response of approving mini program payment activation.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Primary key ID, obtained from the API response of approving mini program payment activation.</p> 
     * @return ID <p>Primary key ID, obtained from the API response of approving mini program payment activation.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Primary key ID, obtained from the API response of approving mini program payment activation.</p>
     * @param ID <p>Primary key ID, obtained from the API response of approving mini program payment activation.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public DisableMNPPaymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableMNPPaymentRequest(DisableMNPPaymentRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

