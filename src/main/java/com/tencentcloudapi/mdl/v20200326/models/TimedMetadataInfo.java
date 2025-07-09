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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimedMetadataInfo extends AbstractModel {

    /**
    * Base64-encoded id3 metadata information, with a maximum limit of 1024 characters.
    */
    @SerializedName("ID3")
    @Expose
    private String ID3;

    /**
     * Get Base64-encoded id3 metadata information, with a maximum limit of 1024 characters. 
     * @return ID3 Base64-encoded id3 metadata information, with a maximum limit of 1024 characters.
     */
    public String getID3() {
        return this.ID3;
    }

    /**
     * Set Base64-encoded id3 metadata information, with a maximum limit of 1024 characters.
     * @param ID3 Base64-encoded id3 metadata information, with a maximum limit of 1024 characters.
     */
    public void setID3(String ID3) {
        this.ID3 = ID3;
    }

    public TimedMetadataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimedMetadataInfo(TimedMetadataInfo source) {
        if (source.ID3 != null) {
            this.ID3 = new String(source.ID3);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID3", this.ID3);

    }
}

