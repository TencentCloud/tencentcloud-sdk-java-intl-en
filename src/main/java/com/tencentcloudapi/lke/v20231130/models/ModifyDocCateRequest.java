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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDocCateRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Category name.

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Category business ID.
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Category name.
 
     * @return Name Category name.

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Category name.

     * @param Name Category name.

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Category business ID. 
     * @return CateBizId Category business ID.
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set Category business ID.
     * @param CateBizId Category business ID.
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    public ModifyDocCateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocCateRequest(ModifyDocCateRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);

    }
}

