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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPdfOcrRequest extends AbstractModel {

    /**
    * <p>Base64-encoded content of the PDF file. The data:application/pdf;base64, prefix is supported (the server automatically strips it).</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get <p>Base64-encoded content of the PDF file. The data:application/pdf;base64, prefix is supported (the server automatically strips it).</p> 
     * @return ImageBase64 <p>Base64-encoded content of the PDF file. The data:application/pdf;base64, prefix is supported (the server automatically strips it).</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>Base64-encoded content of the PDF file. The data:application/pdf;base64, prefix is supported (the server automatically strips it).</p>
     * @param ImageBase64 <p>Base64-encoded content of the PDF file. The data:application/pdf;base64, prefix is supported (the server automatically strips it).</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public VerifyPdfOcrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPdfOcrRequest(VerifyPdfOcrRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

