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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchApplyAccountBaselinesRequest extends AbstractModel {

    /**
    * Member account UIN, which is also the UIN of the account to which the baseline is applied.
    */
    @SerializedName("MemberUinList")
    @Expose
    private Long [] MemberUinList;

    /**
    * List of baseline item configuration information.
    */
    @SerializedName("BaselineConfigItems")
    @Expose
    private BaselineConfigItem [] BaselineConfigItems;

    /**
     * Get Member account UIN, which is also the UIN of the account to which the baseline is applied. 
     * @return MemberUinList Member account UIN, which is also the UIN of the account to which the baseline is applied.
     */
    public Long [] getMemberUinList() {
        return this.MemberUinList;
    }

    /**
     * Set Member account UIN, which is also the UIN of the account to which the baseline is applied.
     * @param MemberUinList Member account UIN, which is also the UIN of the account to which the baseline is applied.
     */
    public void setMemberUinList(Long [] MemberUinList) {
        this.MemberUinList = MemberUinList;
    }

    /**
     * Get List of baseline item configuration information. 
     * @return BaselineConfigItems List of baseline item configuration information.
     */
    public BaselineConfigItem [] getBaselineConfigItems() {
        return this.BaselineConfigItems;
    }

    /**
     * Set List of baseline item configuration information.
     * @param BaselineConfigItems List of baseline item configuration information.
     */
    public void setBaselineConfigItems(BaselineConfigItem [] BaselineConfigItems) {
        this.BaselineConfigItems = BaselineConfigItems;
    }

    public BatchApplyAccountBaselinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchApplyAccountBaselinesRequest(BatchApplyAccountBaselinesRequest source) {
        if (source.MemberUinList != null) {
            this.MemberUinList = new Long[source.MemberUinList.length];
            for (int i = 0; i < source.MemberUinList.length; i++) {
                this.MemberUinList[i] = new Long(source.MemberUinList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "MemberUinList.", this.MemberUinList);
        this.setParamArrayObj(map, prefix + "BaselineConfigItems.", this.BaselineConfigItems);

    }
}

