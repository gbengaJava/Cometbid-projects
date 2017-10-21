/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cometbid.ut.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author Gbenga
 */
@ApplicationException(rollback = true)
public class VendorAlreadyExistException extends ApplicationDefinedExceptions {

    public VendorAlreadyExistException() {
        super("Vendor already exist");
    }

    public VendorAlreadyExistException(String message) {
        super(message);
    }

    public VendorAlreadyExistException(String message, Throwable ex) {
        super(message, ex);
    }

}
