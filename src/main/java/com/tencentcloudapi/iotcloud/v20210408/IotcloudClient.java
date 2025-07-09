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
package com.tencentcloudapi.iotcloud.v20210408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotcloud.v20210408.models.*;

public class IotcloudClient extends AbstractClient{
    private static String endpoint = "iotcloud.intl.tencentcloudapi.com";
    private static String service = "iotcloud";
    private static String version = "2021-04-08";

    public IotcloudClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotcloudClient(Credential credential, String region, ClientProfile profile) {
        super(IotcloudClient.endpoint, IotcloudClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an IoT Hub device. 
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevice", CreateDeviceResponse.class);
    }

    /**
     *This API is used to create a private CA certificate.
     * @param req CreatePrivateCARequest
     * @return CreatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateCAResponse CreatePrivateCA(CreatePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateCA", CreatePrivateCAResponse.class);
    }

    /**
     *This API is used to create a new IoT communication product. 
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProduct", CreateProductResponse.class);
    }

    /**
     *This API is used to delete an IoT Hub device. 
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *This API is used to delete a device shadow. 
     * @param req DeleteDeviceShadowRequest
     * @return DeleteDeviceShadowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceShadowResponse DeleteDeviceShadow(DeleteDeviceShadowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceShadow", DeleteDeviceShadowResponse.class);
    }

    /**
     *This API is used to delete a private CA certificate.
     * @param req DeletePrivateCARequest
     * @return DeletePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateCAResponse DeletePrivateCA(DeletePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateCA", DeletePrivateCAResponse.class);
    }

    /**
     *This API is used to delete an IoT Hub product.
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *This API is used to query device details.
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevice", DescribeDeviceResponse.class);
    }

    /**
     *This API is used to get the list of IoT Hub devices. 
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *This API is used to query private CA certificate details.
     * @param req DescribePrivateCARequest
     * @return DescribePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAResponse DescribePrivateCA(DescribePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCA", DescribePrivateCAResponse.class);
    }

    /**
     *This API is used to query the products bound to a private CA certificate.
     * @param req DescribePrivateCABindedProductsRequest
     * @return DescribePrivateCABindedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCABindedProductsResponse DescribePrivateCABindedProducts(DescribePrivateCABindedProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCABindedProducts", DescribePrivateCABindedProductsResponse.class);
    }

    /**
     *This API is used to get the list of private CA certificates.
     * @param req DescribePrivateCAsRequest
     * @return DescribePrivateCAsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateCAsResponse DescribePrivateCAs(DescribePrivateCAsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateCAs", DescribePrivateCAsResponse.class);
    }

    /**
     *This API is used to query product details.
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProduct", DescribeProductResponse.class);
    }

    /**
     *This API is used to query the CA certificates bound to a product.
     * @param req DescribeProductCARequest
     * @return DescribeProductCAResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductCAResponse DescribeProductCA(DescribeProductCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductCA", DescribeProductCAResponse.class);
    }

    /**
     *This API is used to obtain the product list. 
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *This API is used to enable or disable multiple products at a time.
     * @param req SetProductsForbiddenStatusRequest
     * @return SetProductsForbiddenStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetProductsForbiddenStatusResponse SetProductsForbiddenStatus(SetProductsForbiddenStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetProductsForbiddenStatus", SetProductsForbiddenStatusResponse.class);
    }

    /**
     *This API is used to set the device log level.  
     * @param req UpdateDeviceLogLevelRequest
     * @return UpdateDeviceLogLevelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceLogLevelResponse UpdateDeviceLogLevel(UpdateDeviceLogLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceLogLevel", UpdateDeviceLogLevelResponse.class);
    }

    /**
     *This API is used to enable or disable multiple devices. 
     * @param req UpdateDevicesEnableStateRequest
     * @return UpdateDevicesEnableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicesEnableStateResponse UpdateDevicesEnableState(UpdateDevicesEnableStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevicesEnableState", UpdateDevicesEnableStateResponse.class);
    }

    /**
     *This API is used to update a private CA certificate.
     * @param req UpdatePrivateCARequest
     * @return UpdatePrivateCAResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePrivateCAResponse UpdatePrivateCA(UpdatePrivateCARequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdatePrivateCA", UpdatePrivateCAResponse.class);
    }

    /**
     *This API is used to update the configuration of product dynamic registration. 
     * @param req UpdateProductDynamicRegisterRequest
     * @return UpdateProductDynamicRegisterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductDynamicRegisterResponse UpdateProductDynamicRegister(UpdateProductDynamicRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProductDynamicRegister", UpdateProductDynamicRegisterResponse.class);
    }

}
