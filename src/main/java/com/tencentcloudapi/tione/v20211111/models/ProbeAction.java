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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeAction extends AbstractModel {

    /**
    * HTTP GET action.
    */
    @SerializedName("HTTPGet")
    @Expose
    private HTTPGetAction HTTPGet;

    /**
    * Executes check command action.
    */
    @SerializedName("Exec")
    @Expose
    private ExecAction Exec;

    /**
    * TCP Socket check action.
    */
    @SerializedName("TCPSocket")
    @Expose
    private TCPSocketAction TCPSocket;

    /**
    * Probe type. The default value is HTTPGet. Valid values: HTTPGet, Exec, and TCPSocket.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get HTTP GET action. 
     * @return HTTPGet HTTP GET action.
     */
    public HTTPGetAction getHTTPGet() {
        return this.HTTPGet;
    }

    /**
     * Set HTTP GET action.
     * @param HTTPGet HTTP GET action.
     */
    public void setHTTPGet(HTTPGetAction HTTPGet) {
        this.HTTPGet = HTTPGet;
    }

    /**
     * Get Executes check command action. 
     * @return Exec Executes check command action.
     */
    public ExecAction getExec() {
        return this.Exec;
    }

    /**
     * Set Executes check command action.
     * @param Exec Executes check command action.
     */
    public void setExec(ExecAction Exec) {
        this.Exec = Exec;
    }

    /**
     * Get TCP Socket check action. 
     * @return TCPSocket TCP Socket check action.
     */
    public TCPSocketAction getTCPSocket() {
        return this.TCPSocket;
    }

    /**
     * Set TCP Socket check action.
     * @param TCPSocket TCP Socket check action.
     */
    public void setTCPSocket(TCPSocketAction TCPSocket) {
        this.TCPSocket = TCPSocket;
    }

    /**
     * Get Probe type. The default value is HTTPGet. Valid values: HTTPGet, Exec, and TCPSocket. 
     * @return ActionType Probe type. The default value is HTTPGet. Valid values: HTTPGet, Exec, and TCPSocket.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Probe type. The default value is HTTPGet. Valid values: HTTPGet, Exec, and TCPSocket.
     * @param ActionType Probe type. The default value is HTTPGet. Valid values: HTTPGet, Exec, and TCPSocket.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public ProbeAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeAction(ProbeAction source) {
        if (source.HTTPGet != null) {
            this.HTTPGet = new HTTPGetAction(source.HTTPGet);
        }
        if (source.Exec != null) {
            this.Exec = new ExecAction(source.Exec);
        }
        if (source.TCPSocket != null) {
            this.TCPSocket = new TCPSocketAction(source.TCPSocket);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HTTPGet.", this.HTTPGet);
        this.setParamObj(map, prefix + "Exec.", this.Exec);
        this.setParamObj(map, prefix + "TCPSocket.", this.TCPSocket);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

