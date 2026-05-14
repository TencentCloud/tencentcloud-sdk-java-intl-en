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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * Resource type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * TKE resource layer information.
    */
    @SerializedName("TKEMeta")
    @Expose
    private TkeMeta [] TKEMeta;

    /**
    * CVM resource information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CVMMeta")
    @Expose
    private CVMMeta [] CVMMeta;

    /**
     * Get Resource type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Resource type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Resource type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Resource type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get TKE resource layer information. 
     * @return TKEMeta TKE resource layer information.
     */
    public TkeMeta [] getTKEMeta() {
        return this.TKEMeta;
    }

    /**
     * Set TKE resource layer information.
     * @param TKEMeta TKE resource layer information.
     */
    public void setTKEMeta(TkeMeta [] TKEMeta) {
        this.TKEMeta = TKEMeta;
    }

    /**
     * Get CVM resource information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CVMMeta CVM resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CVMMeta [] getCVMMeta() {
        return this.CVMMeta;
    }

    /**
     * Set CVM resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CVMMeta CVM resource information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCVMMeta(CVMMeta [] CVMMeta) {
        this.CVMMeta = CVMMeta;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.TKEMeta != null) {
            this.TKEMeta = new TkeMeta[source.TKEMeta.length];
            for (int i = 0; i < source.TKEMeta.length; i++) {
                this.TKEMeta[i] = new TkeMeta(source.TKEMeta[i]);
            }
        }
        if (source.CVMMeta != null) {
            this.CVMMeta = new CVMMeta[source.CVMMeta.length];
            for (int i = 0; i < source.CVMMeta.length; i++) {
                this.CVMMeta[i] = new CVMMeta(source.CVMMeta[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArrayObj(map, prefix + "TKEMeta.", this.TKEMeta);
        this.setParamArrayObj(map, prefix + "CVMMeta.", this.CVMMeta);

    }
}

