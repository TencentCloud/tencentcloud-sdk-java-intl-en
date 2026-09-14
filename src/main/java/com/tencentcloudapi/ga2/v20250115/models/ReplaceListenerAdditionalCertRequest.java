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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceListenerAdditionalCertRequest extends AbstractModel {

    /**
    * Global acceleration instance ID.
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * Listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Certificate ID.
    */
    @SerializedName("AdditionalCertificate")
    @Expose
    private String AdditionalCertificate;

    /**
    * Old certificate ID.
    */
    @SerializedName("OldCertificate")
    @Expose
    private String OldCertificate;

    /**
     * Get Global acceleration instance ID. 
     * @return GlobalAcceleratorId Global acceleration instance ID.
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set Global acceleration instance ID.
     * @param GlobalAcceleratorId Global acceleration instance ID.
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get Listener ID. 
     * @return ListenerId Listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID.
     * @param ListenerId Listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Certificate ID. 
     * @return AdditionalCertificate Certificate ID.
     */
    public String getAdditionalCertificate() {
        return this.AdditionalCertificate;
    }

    /**
     * Set Certificate ID.
     * @param AdditionalCertificate Certificate ID.
     */
    public void setAdditionalCertificate(String AdditionalCertificate) {
        this.AdditionalCertificate = AdditionalCertificate;
    }

    /**
     * Get Old certificate ID. 
     * @return OldCertificate Old certificate ID.
     */
    public String getOldCertificate() {
        return this.OldCertificate;
    }

    /**
     * Set Old certificate ID.
     * @param OldCertificate Old certificate ID.
     */
    public void setOldCertificate(String OldCertificate) {
        this.OldCertificate = OldCertificate;
    }

    public ReplaceListenerAdditionalCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceListenerAdditionalCertRequest(ReplaceListenerAdditionalCertRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.AdditionalCertificate != null) {
            this.AdditionalCertificate = new String(source.AdditionalCertificate);
        }
        if (source.OldCertificate != null) {
            this.OldCertificate = new String(source.OldCertificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "AdditionalCertificate", this.AdditionalCertificate);
        this.setParamSimple(map, prefix + "OldCertificate", this.OldCertificate);

    }
}

