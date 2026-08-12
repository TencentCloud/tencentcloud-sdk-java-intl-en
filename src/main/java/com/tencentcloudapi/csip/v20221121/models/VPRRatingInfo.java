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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRRatingInfo extends AbstractModel {

    /**
    * VPR rating result
Enumeration value:
URGENT: Immediate repair
SUGGESTED: Suggested repairs
DEFERRABLE: Deferrable repair
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Rating description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * List of stage rating details
    */
    @SerializedName("Stage")
    @Expose
    private VPRRatingStage [] Stage;

    /**
     * Get VPR rating result
Enumeration value:
URGENT: Immediate repair
SUGGESTED: Suggested repairs
DEFERRABLE: Deferrable repair 
     * @return Result VPR rating result
Enumeration value:
URGENT: Immediate repair
SUGGESTED: Suggested repairs
DEFERRABLE: Deferrable repair
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set VPR rating result
Enumeration value:
URGENT: Immediate repair
SUGGESTED: Suggested repairs
DEFERRABLE: Deferrable repair
     * @param Result VPR rating result
Enumeration value:
URGENT: Immediate repair
SUGGESTED: Suggested repairs
DEFERRABLE: Deferrable repair
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Rating description 
     * @return Remark Rating description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Rating description
     * @param Remark Rating description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get List of stage rating details 
     * @return Stage List of stage rating details
     */
    public VPRRatingStage [] getStage() {
        return this.Stage;
    }

    /**
     * Set List of stage rating details
     * @param Stage List of stage rating details
     */
    public void setStage(VPRRatingStage [] Stage) {
        this.Stage = Stage;
    }

    public VPRRatingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRRatingInfo(VPRRatingInfo source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Stage != null) {
            this.Stage = new VPRRatingStage[source.Stage.length];
            for (int i = 0; i < source.Stage.length; i++) {
                this.Stage[i] = new VPRRatingStage(source.Stage[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Stage.", this.Stage);

    }
}

