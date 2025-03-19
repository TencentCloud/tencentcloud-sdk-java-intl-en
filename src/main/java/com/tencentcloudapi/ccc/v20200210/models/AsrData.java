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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrData extends AbstractModel {

    /**
    * User side.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Message content.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Sentence start time, unix millisecond timestamp.
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * Sentence end time, unix millisecond timestamp.
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get User side. 
     * @return User User side.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User side.
     * @param User User side.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Message content. 
     * @return Message Message content.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message content.
     * @param Message Message content.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Timestamp. 
     * @return Timestamp Timestamp.
     * @deprecated
     */
    @Deprecated
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp.
     * @param Timestamp Timestamp.
     * @deprecated
     */
    @Deprecated
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Sentence start time, unix millisecond timestamp. 
     * @return Start Sentence start time, unix millisecond timestamp.
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Sentence start time, unix millisecond timestamp.
     * @param Start Sentence start time, unix millisecond timestamp.
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get Sentence end time, unix millisecond timestamp. 
     * @return End Sentence end time, unix millisecond timestamp.
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set Sentence end time, unix millisecond timestamp.
     * @param End Sentence end time, unix millisecond timestamp.
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public AsrData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrData(AsrData source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

