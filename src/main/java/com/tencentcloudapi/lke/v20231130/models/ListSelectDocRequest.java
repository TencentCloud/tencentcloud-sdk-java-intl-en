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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSelectDocRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Document name.

    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Document status: 7: under review; 8: review failed; 10: pending release; 11: releasing; 12: released; 13: learning; 14: learning failed; 20: expired.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

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
     * Get Document name.
 
     * @return FileName Document name.

     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Document name.

     * @param FileName Document name.

     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Document status: 7: under review; 8: review failed; 10: pending release; 11: releasing; 12: released; 13: learning; 14: learning failed; 20: expired. 
     * @return Status Document status: 7: under review; 8: review failed; 10: pending release; 11: releasing; 12: released; 13: learning; 14: learning failed; 20: expired.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Document status: 7: under review; 8: review failed; 10: pending release; 11: releasing; 12: released; 13: learning; 14: learning failed; 20: expired.
     * @param Status Document status: 7: under review; 8: review failed; 10: pending release; 11: releasing; 12: released; 13: learning; 14: learning failed; 20: expired.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public ListSelectDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSelectDocRequest(ListSelectDocRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

