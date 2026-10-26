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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserDeviceRequest extends AbstractModel {

    /**
    * <p>Device ID (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>Device name (only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters)</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Device streaming protocol. Only valid for national standard devices. Fill in 0 to make no change (1: UDP, 2: TCP)</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>Device password (only supported for national standard devices, length not exceeding 64 characters)</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Device description (length not exceeding 128 characters)</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Gateway device access protocol (deprecated, reserved for compatibility, can be ignored)</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * <p>Audio on/off (0: off; 1: on), enabled by default. Audio is dropped when turned off.</p>
    */
    @SerializedName("AudioSwitch")
    @Expose
    private Long AudioSwitch;

    /**
    * <p>Subscription switch (0: off; 1: on). Default On. When enabled, it subscribes to device channel transitions. Valid only for national standard NVR devices.</p>
    */
    @SerializedName("SubscribeSwitch")
    @Expose
    private Long SubscribeSwitch;

    /**
    * <p>Whether to enable silent frame (0: disabled; 1: enabled)</p>
    */
    @SerializedName("SilentFrameSwitch")
    @Expose
    private Long SilentFrameSwitch;

    /**
    * <p>Clock sync switch (only effective for national standard devices)</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Default value: 1</p>
    */
    @SerializedName("TimeSyncSwitch")
    @Expose
    private Long TimeSyncSwitch;

    /**
     * Get <p>Device ID (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p> 
     * @return DeviceId <p>Device ID (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>Device ID (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     * @param DeviceId <p>Device ID (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>Device name (only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters)</p> 
     * @return Name <p>Device name (only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters)</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Device name (only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters)</p>
     * @param Name <p>Device name (only supports Chinese, English, numbers, spaces, Chinese and English parentheses, _, -, length not exceeding 128 characters)</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Device streaming protocol. Only valid for national standard devices. Fill in 0 to make no change (1: UDP, 2: TCP)</p> 
     * @return TransportProtocol <p>Device streaming protocol. Only valid for national standard devices. Fill in 0 to make no change (1: UDP, 2: TCP)</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>Device streaming protocol. Only valid for national standard devices. Fill in 0 to make no change (1: UDP, 2: TCP)</p>
     * @param TransportProtocol <p>Device streaming protocol. Only valid for national standard devices. Fill in 0 to make no change (1: UDP, 2: TCP)</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>Device password (only supported for national standard devices, length not exceeding 64 characters)</p> 
     * @return Password <p>Device password (only supported for national standard devices, length not exceeding 64 characters)</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Device password (only supported for national standard devices, length not exceeding 64 characters)</p>
     * @param Password <p>Device password (only supported for national standard devices, length not exceeding 64 characters)</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Device description (length not exceeding 128 characters)</p> 
     * @return Description <p>Device description (length not exceeding 128 characters)</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Device description (length not exceeding 128 characters)</p>
     * @param Description <p>Device description (length not exceeding 128 characters)</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Ip <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Ip <p>Device access IP (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Port <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Port <p>Device Port (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Device username (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return Username <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     * @param Username <p>Device username (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Gateway device access protocol (deprecated, reserved for compatibility, can be ignored)</p> 
     * @return ProtocolType <p>Gateway device access protocol (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>Gateway device access protocol (deprecated, reserved for compatibility, can be ignored)</p>
     * @param ProtocolType <p>Gateway device access protocol (deprecated, reserved for compatibility, can be ignored)</p>
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>Audio on/off (0: off; 1: on), enabled by default. Audio is dropped when turned off.</p> 
     * @return AudioSwitch <p>Audio on/off (0: off; 1: on), enabled by default. Audio is dropped when turned off.</p>
     */
    public Long getAudioSwitch() {
        return this.AudioSwitch;
    }

    /**
     * Set <p>Audio on/off (0: off; 1: on), enabled by default. Audio is dropped when turned off.</p>
     * @param AudioSwitch <p>Audio on/off (0: off; 1: on), enabled by default. Audio is dropped when turned off.</p>
     */
    public void setAudioSwitch(Long AudioSwitch) {
        this.AudioSwitch = AudioSwitch;
    }

    /**
     * Get <p>Subscription switch (0: off; 1: on). Default On. When enabled, it subscribes to device channel transitions. Valid only for national standard NVR devices.</p> 
     * @return SubscribeSwitch <p>Subscription switch (0: off; 1: on). Default On. When enabled, it subscribes to device channel transitions. Valid only for national standard NVR devices.</p>
     */
    public Long getSubscribeSwitch() {
        return this.SubscribeSwitch;
    }

    /**
     * Set <p>Subscription switch (0: off; 1: on). Default On. When enabled, it subscribes to device channel transitions. Valid only for national standard NVR devices.</p>
     * @param SubscribeSwitch <p>Subscription switch (0: off; 1: on). Default On. When enabled, it subscribes to device channel transitions. Valid only for national standard NVR devices.</p>
     */
    public void setSubscribeSwitch(Long SubscribeSwitch) {
        this.SubscribeSwitch = SubscribeSwitch;
    }

    /**
     * Get <p>Whether to enable silent frame (0: disabled; 1: enabled)</p> 
     * @return SilentFrameSwitch <p>Whether to enable silent frame (0: disabled; 1: enabled)</p>
     */
    public Long getSilentFrameSwitch() {
        return this.SilentFrameSwitch;
    }

    /**
     * Set <p>Whether to enable silent frame (0: disabled; 1: enabled)</p>
     * @param SilentFrameSwitch <p>Whether to enable silent frame (0: disabled; 1: enabled)</p>
     */
    public void setSilentFrameSwitch(Long SilentFrameSwitch) {
        this.SilentFrameSwitch = SilentFrameSwitch;
    }

    /**
     * Get <p>Clock sync switch (only effective for national standard devices)</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Default value: 1</p> 
     * @return TimeSyncSwitch <p>Clock sync switch (only effective for national standard devices)</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Default value: 1</p>
     */
    public Long getTimeSyncSwitch() {
        return this.TimeSyncSwitch;
    }

    /**
     * Set <p>Clock sync switch (only effective for national standard devices)</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Default value: 1</p>
     * @param TimeSyncSwitch <p>Clock sync switch (only effective for national standard devices)</p><p>Enumeration values:</p><ul><li>0: Off</li><li>1: On</li></ul><p>Default value: 1</p>
     */
    public void setTimeSyncSwitch(Long TimeSyncSwitch) {
        this.TimeSyncSwitch = TimeSyncSwitch;
    }

    public UpdateUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserDeviceRequest(UpdateUserDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TransportProtocol != null) {
            this.TransportProtocol = new Long(source.TransportProtocol);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.AudioSwitch != null) {
            this.AudioSwitch = new Long(source.AudioSwitch);
        }
        if (source.SubscribeSwitch != null) {
            this.SubscribeSwitch = new Long(source.SubscribeSwitch);
        }
        if (source.SilentFrameSwitch != null) {
            this.SilentFrameSwitch = new Long(source.SilentFrameSwitch);
        }
        if (source.TimeSyncSwitch != null) {
            this.TimeSyncSwitch = new Long(source.TimeSyncSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AudioSwitch", this.AudioSwitch);
        this.setParamSimple(map, prefix + "SubscribeSwitch", this.SubscribeSwitch);
        this.setParamSimple(map, prefix + "SilentFrameSwitch", this.SilentFrameSwitch);
        this.setParamSimple(map, prefix + "TimeSyncSwitch", this.TimeSyncSwitch);

    }
}

