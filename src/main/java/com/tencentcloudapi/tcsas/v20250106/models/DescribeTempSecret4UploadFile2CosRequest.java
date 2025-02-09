/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeTempSecret4UploadFile2CosRequest extends AbstractModel {

    /**
    * Service name
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * File suffix
    */
    @SerializedName("Suffix")
    @Expose
    private String Suffix;

    /**
     * Get Service name 
     * @return BusinessName Service name
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set Service name
     * @param BusinessName Service name
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get File suffix 
     * @return Suffix File suffix
     */
    public String getSuffix() {
        return this.Suffix;
    }

    /**
     * Set File suffix
     * @param Suffix File suffix
     */
    public void setSuffix(String Suffix) {
        this.Suffix = Suffix;
    }

    public DescribeTempSecret4UploadFile2CosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTempSecret4UploadFile2CosRequest(DescribeTempSecret4UploadFile2CosRequest source) {
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.Suffix != null) {
            this.Suffix = new String(source.Suffix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Suffix", this.Suffix);

    }
}

