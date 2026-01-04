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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputFile3D extends AbstractModel {

    /**
    * Specifies the file Url with a valid period of 24 hours.	
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Specifies the file format.	
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Specifies the file Url with a valid period of 24 hours.	 
     * @return Url Specifies the file Url with a valid period of 24 hours.	
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Specifies the file Url with a valid period of 24 hours.	
     * @param Url Specifies the file Url with a valid period of 24 hours.	
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Specifies the file format.	 
     * @return Type Specifies the file format.	
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies the file format.	
     * @param Type Specifies the file format.	
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public InputFile3D() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputFile3D(InputFile3D source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

