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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSignStatus extends AbstractModel{

    /**
    * Signature ID.
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * Signature application ID.
    */
    @SerializedName("SignApplyId")
    @Expose
    private Long SignApplyId;

    /**
     * Get Signature ID. 
     * @return SignId Signature ID.
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set Signature ID.
     * @param SignId Signature ID.
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
    }

    /**
     * Get Signature application ID. 
     * @return SignApplyId Signature application ID.
     */
    public Long getSignApplyId() {
        return this.SignApplyId;
    }

    /**
     * Set Signature application ID.
     * @param SignApplyId Signature application ID.
     */
    public void setSignApplyId(Long SignApplyId) {
        this.SignApplyId = SignApplyId;
    }

    public AddSignStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSignStatus(AddSignStatus source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
        }
        if (source.SignApplyId != null) {
            this.SignApplyId = new Long(source.SignApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "SignApplyId", this.SignApplyId);

    }
}

