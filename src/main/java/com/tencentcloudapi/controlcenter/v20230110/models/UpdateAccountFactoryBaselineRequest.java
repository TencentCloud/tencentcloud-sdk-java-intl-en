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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAccountFactoryBaselineRequest extends AbstractModel {

    /**
    * Specifies the baseline name, which must be unique and can only contain a combination of english letters, digits, chinese characters, and symbols @, &_[]-, with a length of 1-25 chinese or english characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Baseline configuration. overwrite update. can be accessed through controlcenter:GetAccountFactoryBaseline to query existing baseline configuration. can be accessed through controlcenter:ListAccountFactoryBaselineItems to query supported baseline list.
    */
    @SerializedName("BaselineConfigItems")
    @Expose
    private BaselineConfigItem [] BaselineConfigItems;

    /**
     * Get Specifies the baseline name, which must be unique and can only contain a combination of english letters, digits, chinese characters, and symbols @, &_[]-, with a length of 1-25 chinese or english characters. 
     * @return Name Specifies the baseline name, which must be unique and can only contain a combination of english letters, digits, chinese characters, and symbols @, &_[]-, with a length of 1-25 chinese or english characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the baseline name, which must be unique and can only contain a combination of english letters, digits, chinese characters, and symbols @, &_[]-, with a length of 1-25 chinese or english characters.
     * @param Name Specifies the baseline name, which must be unique and can only contain a combination of english letters, digits, chinese characters, and symbols @, &_[]-, with a length of 1-25 chinese or english characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Baseline configuration. overwrite update. can be accessed through controlcenter:GetAccountFactoryBaseline to query existing baseline configuration. can be accessed through controlcenter:ListAccountFactoryBaselineItems to query supported baseline list. 
     * @return BaselineConfigItems Baseline configuration. overwrite update. can be accessed through controlcenter:GetAccountFactoryBaseline to query existing baseline configuration. can be accessed through controlcenter:ListAccountFactoryBaselineItems to query supported baseline list.
     */
    public BaselineConfigItem [] getBaselineConfigItems() {
        return this.BaselineConfigItems;
    }

    /**
     * Set Baseline configuration. overwrite update. can be accessed through controlcenter:GetAccountFactoryBaseline to query existing baseline configuration. can be accessed through controlcenter:ListAccountFactoryBaselineItems to query supported baseline list.
     * @param BaselineConfigItems Baseline configuration. overwrite update. can be accessed through controlcenter:GetAccountFactoryBaseline to query existing baseline configuration. can be accessed through controlcenter:ListAccountFactoryBaselineItems to query supported baseline list.
     */
    public void setBaselineConfigItems(BaselineConfigItem [] BaselineConfigItems) {
        this.BaselineConfigItems = BaselineConfigItems;
    }

    public UpdateAccountFactoryBaselineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccountFactoryBaselineRequest(UpdateAccountFactoryBaselineRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BaselineConfigItems != null) {
            this.BaselineConfigItems = new BaselineConfigItem[source.BaselineConfigItems.length];
            for (int i = 0; i < source.BaselineConfigItems.length; i++) {
                this.BaselineConfigItems[i] = new BaselineConfigItem(source.BaselineConfigItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "BaselineConfigItems.", this.BaselineConfigItems);

    }
}

