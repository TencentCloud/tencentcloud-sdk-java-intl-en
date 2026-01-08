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

public class CreateGlobalDomainResp extends AbstractModel {

    /**
    * Result
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Indicates the duplicate domain name.
    */
    @SerializedName("RepeatUrls")
    @Expose
    private String [] RepeatUrls;

    /**
    * Lists allowed domain names.
    */
    @SerializedName("ExistsWhiteUrls")
    @Expose
    private String [] ExistsWhiteUrls;

    /**
    * Indicates the domain name already exists in the blocklist.
    */
    @SerializedName("ExistsBlackUrls")
    @Expose
    private String [] ExistsBlackUrls;

    /**
     * Get Result 
     * @return Result Result
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Result
     * @param Result Result
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Indicates the duplicate domain name. 
     * @return RepeatUrls Indicates the duplicate domain name.
     */
    public String [] getRepeatUrls() {
        return this.RepeatUrls;
    }

    /**
     * Set Indicates the duplicate domain name.
     * @param RepeatUrls Indicates the duplicate domain name.
     */
    public void setRepeatUrls(String [] RepeatUrls) {
        this.RepeatUrls = RepeatUrls;
    }

    /**
     * Get Lists allowed domain names. 
     * @return ExistsWhiteUrls Lists allowed domain names.
     */
    public String [] getExistsWhiteUrls() {
        return this.ExistsWhiteUrls;
    }

    /**
     * Set Lists allowed domain names.
     * @param ExistsWhiteUrls Lists allowed domain names.
     */
    public void setExistsWhiteUrls(String [] ExistsWhiteUrls) {
        this.ExistsWhiteUrls = ExistsWhiteUrls;
    }

    /**
     * Get Indicates the domain name already exists in the blocklist. 
     * @return ExistsBlackUrls Indicates the domain name already exists in the blocklist.
     */
    public String [] getExistsBlackUrls() {
        return this.ExistsBlackUrls;
    }

    /**
     * Set Indicates the domain name already exists in the blocklist.
     * @param ExistsBlackUrls Indicates the domain name already exists in the blocklist.
     */
    public void setExistsBlackUrls(String [] ExistsBlackUrls) {
        this.ExistsBlackUrls = ExistsBlackUrls;
    }

    public CreateGlobalDomainResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalDomainResp(CreateGlobalDomainResp source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.RepeatUrls != null) {
            this.RepeatUrls = new String[source.RepeatUrls.length];
            for (int i = 0; i < source.RepeatUrls.length; i++) {
                this.RepeatUrls[i] = new String(source.RepeatUrls[i]);
            }
        }
        if (source.ExistsWhiteUrls != null) {
            this.ExistsWhiteUrls = new String[source.ExistsWhiteUrls.length];
            for (int i = 0; i < source.ExistsWhiteUrls.length; i++) {
                this.ExistsWhiteUrls[i] = new String(source.ExistsWhiteUrls[i]);
            }
        }
        if (source.ExistsBlackUrls != null) {
            this.ExistsBlackUrls = new String[source.ExistsBlackUrls.length];
            for (int i = 0; i < source.ExistsBlackUrls.length; i++) {
                this.ExistsBlackUrls[i] = new String(source.ExistsBlackUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArraySimple(map, prefix + "RepeatUrls.", this.RepeatUrls);
        this.setParamArraySimple(map, prefix + "ExistsWhiteUrls.", this.ExistsWhiteUrls);
        this.setParamArraySimple(map, prefix + "ExistsBlackUrls.", this.ExistsBlackUrls);

    }
}

