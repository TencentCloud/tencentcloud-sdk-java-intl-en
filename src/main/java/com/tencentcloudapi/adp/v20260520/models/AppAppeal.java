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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppAppeal extends AbstractModel {

    /**
    * Configuration items in an appeal
    */
    @SerializedName("AppealingStatus")
    @Expose
    private AppealingStatus AppealingStatus;

    /**
     * Get Configuration items in an appeal 
     * @return AppealingStatus Configuration items in an appeal
     */
    public AppealingStatus getAppealingStatus() {
        return this.AppealingStatus;
    }

    /**
     * Set Configuration items in an appeal
     * @param AppealingStatus Configuration items in an appeal
     */
    public void setAppealingStatus(AppealingStatus AppealingStatus) {
        this.AppealingStatus = AppealingStatus;
    }

    public AppAppeal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAppeal(AppAppeal source) {
        if (source.AppealingStatus != null) {
            this.AppealingStatus = new AppealingStatus(source.AppealingStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppealingStatus.", this.AppealingStatus);

    }
}

