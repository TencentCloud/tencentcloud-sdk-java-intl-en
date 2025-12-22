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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgType extends AbstractModel {

    /**
    * Ftp protocol Alg functionality whether enabled, available values:.
<li>true: enable Ftp protocol Alg functionality.</li>.
<li>false: disable Ftp protocol Alg functionality.</li>.
    */
    @SerializedName("Ftp")
    @Expose
    private Boolean Ftp;

    /**
    * Whether the Sip protocol Alg function is enabled. available values:.
<li>true: enable Sip protocol Alg function.</li>.
<li>false: disable Sip protocol Alg function.</li>.
    */
    @SerializedName("Sip")
    @Expose
    private Boolean Sip;

    /**
     * Get Ftp protocol Alg functionality whether enabled, available values:.
<li>true: enable Ftp protocol Alg functionality.</li>.
<li>false: disable Ftp protocol Alg functionality.</li>. 
     * @return Ftp Ftp protocol Alg functionality whether enabled, available values:.
<li>true: enable Ftp protocol Alg functionality.</li>.
<li>false: disable Ftp protocol Alg functionality.</li>.
     */
    public Boolean getFtp() {
        return this.Ftp;
    }

    /**
     * Set Ftp protocol Alg functionality whether enabled, available values:.
<li>true: enable Ftp protocol Alg functionality.</li>.
<li>false: disable Ftp protocol Alg functionality.</li>.
     * @param Ftp Ftp protocol Alg functionality whether enabled, available values:.
<li>true: enable Ftp protocol Alg functionality.</li>.
<li>false: disable Ftp protocol Alg functionality.</li>.
     */
    public void setFtp(Boolean Ftp) {
        this.Ftp = Ftp;
    }

    /**
     * Get Whether the Sip protocol Alg function is enabled. available values:.
<li>true: enable Sip protocol Alg function.</li>.
<li>false: disable Sip protocol Alg function.</li>. 
     * @return Sip Whether the Sip protocol Alg function is enabled. available values:.
<li>true: enable Sip protocol Alg function.</li>.
<li>false: disable Sip protocol Alg function.</li>.
     */
    public Boolean getSip() {
        return this.Sip;
    }

    /**
     * Set Whether the Sip protocol Alg function is enabled. available values:.
<li>true: enable Sip protocol Alg function.</li>.
<li>false: disable Sip protocol Alg function.</li>.
     * @param Sip Whether the Sip protocol Alg function is enabled. available values:.
<li>true: enable Sip protocol Alg function.</li>.
<li>false: disable Sip protocol Alg function.</li>.
     */
    public void setSip(Boolean Sip) {
        this.Sip = Sip;
    }

    public AlgType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgType(AlgType source) {
        if (source.Ftp != null) {
            this.Ftp = new Boolean(source.Ftp);
        }
        if (source.Sip != null) {
            this.Sip = new Boolean(source.Sip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftp", this.Ftp);
        this.setParamSimple(map, prefix + "Sip", this.Sip);

    }
}

