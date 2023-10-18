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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkSessionBatchLogOperate extends AbstractModel {

    /**
    * The operation message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The operation type. Valid values: `COPY`, `LOG`, `UI`, `RESULT`, `List`, and `TAB`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * Additional information, such as taskid, sessionid, and sparkui.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Supplement")
    @Expose
    private KVPair [] Supplement;

    /**
     * Get The operation message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Text The operation message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The operation message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Text The operation message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The operation type. Valid values: `COPY`, `LOG`, `UI`, `RESULT`, `List`, and `TAB`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operate The operation type. Valid values: `COPY`, `LOG`, `UI`, `RESULT`, `List`, and `TAB`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set The operation type. Valid values: `COPY`, `LOG`, `UI`, `RESULT`, `List`, and `TAB`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operate The operation type. Valid values: `COPY`, `LOG`, `UI`, `RESULT`, `List`, and `TAB`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Additional information, such as taskid, sessionid, and sparkui.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Supplement Additional information, such as taskid, sessionid, and sparkui.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getSupplement() {
        return this.Supplement;
    }

    /**
     * Set Additional information, such as taskid, sessionid, and sparkui.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Supplement Additional information, such as taskid, sessionid, and sparkui.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupplement(KVPair [] Supplement) {
        this.Supplement = Supplement;
    }

    public SparkSessionBatchLogOperate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkSessionBatchLogOperate(SparkSessionBatchLogOperate source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Supplement != null) {
            this.Supplement = new KVPair[source.Supplement.length];
            for (int i = 0; i < source.Supplement.length; i++) {
                this.Supplement[i] = new KVPair(source.Supplement[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamArrayObj(map, prefix + "Supplement.", this.Supplement);

    }
}

