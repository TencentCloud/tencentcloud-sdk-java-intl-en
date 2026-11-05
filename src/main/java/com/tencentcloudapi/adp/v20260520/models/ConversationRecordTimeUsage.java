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

public class ConversationRecordTimeUsage extends AbstractModel {

    /**
    * <p>Total time consumed for a single dialogue, in milliseconds</p>
    */
    @SerializedName("Elapsed")
    @Expose
    private String Elapsed;

    /**
    * <p>Time to first token, in milliseconds</p>
    */
    @SerializedName("FirstTokenCost")
    @Expose
    private String FirstTokenCost;

    /**
    * <p>Total time consumed for model inference, in milliseconds</p>
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get <p>Total time consumed for a single dialogue, in milliseconds</p> 
     * @return Elapsed <p>Total time consumed for a single dialogue, in milliseconds</p>
     */
    public String getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set <p>Total time consumed for a single dialogue, in milliseconds</p>
     * @param Elapsed <p>Total time consumed for a single dialogue, in milliseconds</p>
     */
    public void setElapsed(String Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get <p>Time to first token, in milliseconds</p> 
     * @return FirstTokenCost <p>Time to first token, in milliseconds</p>
     */
    public String getFirstTokenCost() {
        return this.FirstTokenCost;
    }

    /**
     * Set <p>Time to first token, in milliseconds</p>
     * @param FirstTokenCost <p>Time to first token, in milliseconds</p>
     */
    public void setFirstTokenCost(String FirstTokenCost) {
        this.FirstTokenCost = FirstTokenCost;
    }

    /**
     * Get <p>Total time consumed for model inference, in milliseconds</p> 
     * @return TotalCost <p>Total time consumed for model inference, in milliseconds</p>
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <p>Total time consumed for model inference, in milliseconds</p>
     * @param TotalCost <p>Total time consumed for model inference, in milliseconds</p>
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public ConversationRecordTimeUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationRecordTimeUsage(ConversationRecordTimeUsage source) {
        if (source.Elapsed != null) {
            this.Elapsed = new String(source.Elapsed);
        }
        if (source.FirstTokenCost != null) {
            this.FirstTokenCost = new String(source.FirstTokenCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "FirstTokenCost", this.FirstTokenCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

