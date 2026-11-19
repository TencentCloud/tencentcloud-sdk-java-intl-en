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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnershipVerification extends AbstractModel {

    /**
    * <p>DNS verification</p>
    */
    @SerializedName("DnsVerification")
    @Expose
    private DnsVerification DnsVerification;

    /**
    * <p>File verification</p>
    */
    @SerializedName("FileVerification")
    @Expose
    private FileVerification FileVerification;

    /**
    * <p>NS verification</p>
    */
    @SerializedName("NsVerification")
    @Expose
    private NsVerification NsVerification;

    /**
     * Get <p>DNS verification</p> 
     * @return DnsVerification <p>DNS verification</p>
     */
    public DnsVerification getDnsVerification() {
        return this.DnsVerification;
    }

    /**
     * Set <p>DNS verification</p>
     * @param DnsVerification <p>DNS verification</p>
     */
    public void setDnsVerification(DnsVerification DnsVerification) {
        this.DnsVerification = DnsVerification;
    }

    /**
     * Get <p>File verification</p> 
     * @return FileVerification <p>File verification</p>
     */
    public FileVerification getFileVerification() {
        return this.FileVerification;
    }

    /**
     * Set <p>File verification</p>
     * @param FileVerification <p>File verification</p>
     */
    public void setFileVerification(FileVerification FileVerification) {
        this.FileVerification = FileVerification;
    }

    /**
     * Get <p>NS verification</p> 
     * @return NsVerification <p>NS verification</p>
     */
    public NsVerification getNsVerification() {
        return this.NsVerification;
    }

    /**
     * Set <p>NS verification</p>
     * @param NsVerification <p>NS verification</p>
     */
    public void setNsVerification(NsVerification NsVerification) {
        this.NsVerification = NsVerification;
    }

    public OwnershipVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnershipVerification(OwnershipVerification source) {
        if (source.DnsVerification != null) {
            this.DnsVerification = new DnsVerification(source.DnsVerification);
        }
        if (source.FileVerification != null) {
            this.FileVerification = new FileVerification(source.FileVerification);
        }
        if (source.NsVerification != null) {
            this.NsVerification = new NsVerification(source.NsVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DnsVerification.", this.DnsVerification);
        this.setParamObj(map, prefix + "FileVerification.", this.FileVerification);
        this.setParamObj(map, prefix + "NsVerification.", this.NsVerification);

    }
}

