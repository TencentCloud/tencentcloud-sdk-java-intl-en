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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateKeyDescriptionRequest extends AbstractModel{

    /**
    * New description of up to 1,024 bytes in length
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID of the CMK for which to modify the description
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get New description of up to 1,024 bytes in length 
     * @return Description New description of up to 1,024 bytes in length
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set New description of up to 1,024 bytes in length
     * @param Description New description of up to 1,024 bytes in length
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ID of the CMK for which to modify the description 
     * @return KeyId ID of the CMK for which to modify the description
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set ID of the CMK for which to modify the description
     * @param KeyId ID of the CMK for which to modify the description
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

