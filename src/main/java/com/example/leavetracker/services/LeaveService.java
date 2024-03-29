package com.example.leavetracker.services;

import com.example.leavetracker.models.request.LeaveRequestModel;
import com.example.leavetracker.models.response.ResponseModel;

public interface LeaveService {

    /**
     * this method is used to add a new leave to db.
     *
     * @param leaveRequestModel: Leave class object.
     * @return HttpStatus : will return ok if done else
     * error will reported to logs.
     */
    ResponseModel applyLeave(LeaveRequestModel leaveRequestModel);

    /**
     * this method is used to get all the leaves basaed on employee id
     *
     * @param empId :id of the employee
     * @return List of all the leaves associated with the employee.
     */
    ResponseModel getLeave(Long empId);

    /**
     * this method is used to get a particular leave based on id
     *
     * @param leaveID : id associated with the leave.
     * @return ResponseEntity object containing leave and http response.
     */
    ResponseModel getLeaveById(Long leaveID);
}
