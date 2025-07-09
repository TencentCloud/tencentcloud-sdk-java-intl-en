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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionFieldConfigResult extends AbstractModel {

    /**
    * Action ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * Action name
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * Filed configuration details corresponding to the action
    */
    @SerializedName("ConfigDetail")
    @Expose
    private ActionFieldConfigDetail [] ConfigDetail;

    /**
     * Get Action ID 
     * @return ActionId Action ID
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set Action ID
     * @param ActionId Action ID
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get Action name 
     * @return ActionName Action name
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set Action name
     * @param ActionName Action name
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get Filed configuration details corresponding to the action 
     * @return ConfigDetail Filed configuration details corresponding to the action
     */
    public ActionFieldConfigDetail [] getConfigDetail() {
        return this.ConfigDetail;
    }

    /**
     * Set Filed configuration details corresponding to the action
     * @param ConfigDetail Filed configuration details corresponding to the action
     */
    public void setConfigDetail(ActionFieldConfigDetail [] ConfigDetail) {
        this.ConfigDetail = ConfigDetail;
    }

    public ActionFieldConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionFieldConfigResult(ActionFieldConfigResult source) {
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.ConfigDetail != null) {
            this.ConfigDetail = new ActionFieldConfigDetail[source.ConfigDetail.length];
            for (int i = 0; i < source.ConfigDetail.length; i++) {
                this.ConfigDetail[i] = new ActionFieldConfigDetail(source.ConfigDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamArrayObj(map, prefix + "ConfigDetail.", this.ConfigDetail);

    }
}

