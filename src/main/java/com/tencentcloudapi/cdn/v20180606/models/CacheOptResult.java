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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheOptResult extends AbstractModel {

    /**
    * List of succeeded URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessUrls")
    @Expose
    private String [] SuccessUrls;

    /**
    * List of failed URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FailUrls")
    @Expose
    private String [] FailUrls;

    /**
     * Get List of succeeded URLs
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SuccessUrls List of succeeded URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getSuccessUrls() {
        return this.SuccessUrls;
    }

    /**
     * Set List of succeeded URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SuccessUrls List of succeeded URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSuccessUrls(String [] SuccessUrls) {
        this.SuccessUrls = SuccessUrls;
    }

    /**
     * Get List of failed URLs
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FailUrls List of failed URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getFailUrls() {
        return this.FailUrls;
    }

    /**
     * Set List of failed URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FailUrls List of failed URLs
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFailUrls(String [] FailUrls) {
        this.FailUrls = FailUrls;
    }

    public CacheOptResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheOptResult(CacheOptResult source) {
        if (source.SuccessUrls != null) {
            this.SuccessUrls = new String[source.SuccessUrls.length];
            for (int i = 0; i < source.SuccessUrls.length; i++) {
                this.SuccessUrls[i] = new String(source.SuccessUrls[i]);
            }
        }
        if (source.FailUrls != null) {
            this.FailUrls = new String[source.FailUrls.length];
            for (int i = 0; i < source.FailUrls.length; i++) {
                this.FailUrls[i] = new String(source.FailUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SuccessUrls.", this.SuccessUrls);
        this.setParamArraySimple(map, prefix + "FailUrls.", this.FailUrls);

    }
}

