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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinGameServerSessionResponse extends AbstractModel{

    /**
    * Player session
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerSession")
    @Expose
    private PlayerSession PlayerSession;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Player session
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerSession Player session
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PlayerSession getPlayerSession() {
        return this.PlayerSession;
    }

    /**
     * Set Player session
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerSession Player session
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerSession(PlayerSession PlayerSession) {
        this.PlayerSession = PlayerSession;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public JoinGameServerSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionResponse(JoinGameServerSessionResponse source) {
        if (source.PlayerSession != null) {
            this.PlayerSession = new PlayerSession(source.PlayerSession);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PlayerSession.", this.PlayerSession);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

