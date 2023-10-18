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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkCustomPolicy extends AbstractModel {

    /**
    * Network policy direction. Valid values: `FROM`, `TO`.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Network policy port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ports")
    @Expose
    private NetworkPorts [] Ports;

    /**
    * Network policy object

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Peer")
    @Expose
    private NetworkPeer [] Peer;

    /**
     * Get Network policy direction. Valid values: `FROM`, `TO`. 
     * @return Direction Network policy direction. Valid values: `FROM`, `TO`.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Network policy direction. Valid values: `FROM`, `TO`.
     * @param Direction Network policy direction. Valid values: `FROM`, `TO`.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Network policy port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ports Network policy port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetworkPorts [] getPorts() {
        return this.Ports;
    }

    /**
     * Set Network policy port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ports Network policy port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPorts(NetworkPorts [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get Network policy object

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Peer Network policy object

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetworkPeer [] getPeer() {
        return this.Peer;
    }

    /**
     * Set Network policy object

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Peer Network policy object

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeer(NetworkPeer [] Peer) {
        this.Peer = Peer;
    }

    public NetworkCustomPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkCustomPolicy(NetworkCustomPolicy source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Ports != null) {
            this.Ports = new NetworkPorts[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new NetworkPorts(source.Ports[i]);
            }
        }
        if (source.Peer != null) {
            this.Peer = new NetworkPeer[source.Peer.length];
            for (int i = 0; i < source.Peer.length; i++) {
                this.Peer[i] = new NetworkPeer(source.Peer[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "Peer.", this.Peer);

    }
}

